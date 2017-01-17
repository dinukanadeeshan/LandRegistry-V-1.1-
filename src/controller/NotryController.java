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
import model.Notry;

/**
 *
 * @author Dinuka
 */
public class NotryController {
    public static int addNotry(Notry notryModel) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getConnection();
        try{
            connection.setAutoCommit(false);
            String query = "insert into Notry values(?,?,?,?,?,?,?)";

           int res1 = DBHandle.setData(connection, query,new Object[]{notryModel.getNotryCode(),notryModel.getName(),notryModel.getAddress(), notryModel.getNotryOrJudge(), notryModel.getDateOfAppointment(), notryModel.getGender(), notryModel.getOfficeCode()});
           query = "insert into MediumDetail values(?,?)";
           int res2 = 0, res3 = 0, res4 = 0;
           if(notryModel.isSinhalaMedium()){
                res2 = DBHandle.setData(connection, query, new Object[]{notryModel.getNotryCode(),"S"});
           }
           if(notryModel.isEnglishMedium()){
                res3 = DBHandle.setData(connection, query, new Object[]{notryModel.getNotryCode(),"E"});
           }
           if(notryModel.isTamilMedium()){
               res4 = DBHandle.setData(connection, query, new Object[]{notryModel.getNotryCode(),"T"});
           }
           connection.commit();
           return res1 + res2 + res3 + res4;
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        } finally {
            connection.setAutoCommit(true);
        }
    }
    public static ArrayList<String> getNotries() throws SQLException, ClassNotFoundException{
        String query = "select notryCode, name from Notry";
        
        ResultSet rst = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> notryList = new ArrayList<String>();
        while (rst.next()) {
            notryList.add(rst.getString(1)+ " - "+ rst.getString(2));
        }
       
        return notryList;
    }
    public static ArrayList<String> getMedium(String notryCode) throws ClassNotFoundException, SQLException{
        String query = "select mediumCode from MediumDetail where notryCode =  '"+notryCode+"' order by 1";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> mediums = new ArrayList<String>();
        while (resultSet.next()) {            
            mediums.add(resultSet.getString(1));
        }
        return mediums;
    }
    public static Notry getNotry(String notryCode) throws ClassNotFoundException, SQLException {
        String query = "select * from Notry where notryCode = '"+notryCode+"'";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        ArrayList<String> mediumList = getMedium(resultSet.getString("notryCode"));
        boolean isSinhala = false, isTamil = false, isEnglish = false;
        for (int i = 0; i < mediumList.size(); i++) {
            String medium = mediumList.get(i);
            if (medium.equals("S")) {
                isSinhala = true;
            } else if(medium.equals("E")){
                isEnglish = true;
            } else {
                isTamil = true;
            }
        }
        return new Notry(resultSet.getString("notryCode"), resultSet.getString("name"), resultSet.getString("address"), 
                   isSinhala, isEnglish, isTamil,resultSet.getString("notryOrJudge"), resultSet.getString("dateOfAppointment"),
                resultSet.getString("gender"), resultSet.getString("officeCode"));
    }
    public static int removeNotry(String notryCode) throws ClassNotFoundException, SQLException{
        String query = "delete from Notry where notryCode = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, notryCode);
    }
    public static int updateNotry(Notry notry) throws SQLException, ClassNotFoundException{
        String query = "update Notry set name = ?, address = ?, gender = ?, notryOrJudge = ?, dateOfAppointment = ?, officeCode = ? where notryCode = ?";
        
        return DBHandle.setData(DBConnection.getConnection(), query, notry.getName(), notry.getAddress(), notry.getGender(), notry.getNotryOrJudge(), notry.getDateOfAppointment(), notry.getOfficeCode(), notry.getNotryCode());
    }
    public static String getOffice(String notryCode) throws SQLException, ClassNotFoundException{
        String query = "select (select name from Office o where n.officeCode = o.officeCode)as office from Notry n where n.notryCode = '"+notryCode+"'";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return resultSet.getString(1);
    }
}
