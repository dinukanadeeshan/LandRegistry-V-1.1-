/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import db.DBHandle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DayBook;
import model.Deed;

/**
 *
 * @author Dinuka
 */
public class DayBookController {

    public static int addDayBookRecord(DayBook dayBook, Deed deed) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getConnection();
        try {
            connection.setAutoCommit(false);
            int res1 = 0, res2 = 0;

            String query = "insert into DayBookRecord values(?,?,?,?,?) ";
            res1 = DBHandle.setData(connection, query, dayBook.getDayBookNo(), dayBook.getRecDate(), dayBook.getRecTime(), dayBook.getClientCode(), dayBook.getRegistrationDuty());
            res2 = DeedController.addDeed(deed);
            connection.commit();
            return res1 + res2;
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }

    }

    public static ArrayList<String> getRegisteredDayBookNoList() throws ClassNotFoundException, SQLException {
        String query = "select d.dayBookNo from Deed d where d.deedId IN (select deedId from registration)";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> dayBookNoList = new ArrayList<String>();
        while (resultSet.next()) {
            dayBookNoList.add(resultSet.getString(1));
        }
        return dayBookNoList;
    }

    public static ArrayList<String> getUnRegisteredDayBookNoList() throws SQLException, ClassNotFoundException {
        String query = "select d.dayBookNo from Deed d where d.deedId NOT IN (select deedId from registration)";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> dayBookNoList = new ArrayList<String>();
        while (resultSet.next()) {
            dayBookNoList.add(resultSet.getString(1));
        }
        return dayBookNoList;
    }

    public static String getDayBookNoToRegister(String book) throws SQLException, ClassNotFoundException {
        String query = "select d.dayBookNo from Deed d where d.deedId NOT IN (select deedId from registration) and d.dayBookNo Like '" + book.charAt(0) + "%' limit 1";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return resultSet.getString(1);
    }

    public static ArrayList<String> getDueToReturnDayBookNo() throws ClassNotFoundException, SQLException {
        String query = "select d.dayBookNo from Deed d where d.deedId IN (select deedId from Registration) AND d.dayBookNo NOT IN (select dayBookNo from ReturningDetail)";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> dayBookNoList = new ArrayList<String>();
        while (resultSet.next()) {
            dayBookNoList.add(resultSet.getString(1));
        }
        return dayBookNoList;
    }

    public static ArrayList<ArrayList<String>> getDailyDayBookRecords(String date) throws SQLException, ClassNotFoundException {
        String query = "SELECT db.recTime, db.dayBookNo, (select name from Client where db.clientCode=clientCode) as ClientName, (select address from Client where db.clientCode=clientCode) as ClientAddress, "
                + "(select name from NatureOfDeed where natureCode In (select natureCode from Deed where dayBookNo=db.dayBookNo)) AS Nature, (select name from Notry where notryCode In (select notryCode from Deed where dayBookNo=db.dayBookNo)) as NotryName, "
                + "(select name from Office where officeCode In(Select officeCode from Notry where notryCode IN (select notryCode from Deed where dayBookNo=db.dayBookNo))) as NotryAddress, (select notryNo from Deed where dayBookNo=db.dayBookNo) as NotryNo, "
                + "(select deedDate from Deed where dayBookNo=db.dayBookNo) as DeedDate, (select registrationDuty from NatureOfDeed where natureCode In (select natureCode from Deed where dayBookNo=db.dayBookNo)) AS RegDuty "
                + "FROM	DayBookRecord db where recDate = '" + date + "' ";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<ArrayList<String>> recordList = new ArrayList<ArrayList<String>>();
        while (resultSet.next()) {
            ArrayList<String> dayBookInfo = new ArrayList<String>();
            for (int i = 1; i <= 10; i++) {
                dayBookInfo.add(resultSet.getString(i));
            }
            recordList.add(dayBookInfo);
        }
        return recordList;
    }
}
