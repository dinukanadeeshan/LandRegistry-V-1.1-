/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import db.DBHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Office;

/**
 *
 * @author Nadeeshan
 */
public class OfficeController {
    public static ArrayList<String> getOfficeList() throws ClassNotFoundException, SQLException{
        String query = "select name from Office";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> officeList = new ArrayList<String>();
        while (resultSet.next()) {
            officeList.add(resultSet.getString(1));
        }
        return officeList;
    }

    public static String getOfficeCode(String name) throws SQLException, ClassNotFoundException {
        String query = "select officeCode from Office where name = '"+name+"'";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return resultSet.getString(1);
    }

    public static String getOfficeName(String officeCode) throws SQLException, ClassNotFoundException {
         String query = "select name from Office where officeCode = '"+officeCode+"'";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return resultSet.getString(1);
    }

    public static int addOffice(Office office) throws ClassNotFoundException, SQLException {
        String query = "insert into Office values(?,?)";
        return DBHandle.setData(DBConnection.getConnection(), query, office.getOfficeCode(), office.getName());
    }

    public static int deleteOffice(String officeCode) throws ClassNotFoundException, SQLException {
         String query = "delete from Office where officeCode = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, officeCode);
    }

    public static ArrayList<Office> getOffices() throws SQLException, ClassNotFoundException {
        String query = "select * from Office";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<Office> officeList = new ArrayList<Office>();
        while (resultSet.next()) {
            officeList.add(new Office(resultSet.getString(1), resultSet.getString(2)));
        }
        return officeList;
    }

    public static int updateOffice(Office office) throws SQLException, ClassNotFoundException {
        String query = "update Office set name = ? where officeCode = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, office.getName(), office.getOfficeCode());
    }
}
