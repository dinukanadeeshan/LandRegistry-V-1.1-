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
import model.Nature;

/**
 *
 * @author Nadeeshan
 */
public class NatureController {
    public static int addNatureOfDeed(Nature nature) throws ClassNotFoundException, SQLException{
        String query = "insert into NatureOfDeed values(?,?,?)";
        return DBHandle.setData(DBConnection.getConnection(), query, nature.getNatureCode(), nature.getName(), nature.getRegistrationDuty());
    }
    public static ArrayList<Nature> getNatureListOfDeed() throws ClassNotFoundException, SQLException{
        String query = "select * from NatureOfDeed";
        ArrayList<Nature> natures = new ArrayList<Nature>();
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        while (resultSet.next()) {
            natures.add(new Nature(resultSet.getString(1), resultSet.getString(2), resultSet.getDouble(3)));
        }
        return  natures;
    }
    public static Nature searchNature(String natureCode) throws ClassNotFoundException, SQLException{
        String query = "select * from NatureOfDeed where natureCode = '"+natureCode+"'";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return new Nature(natureCode, resultSet.getString(2), resultSet.getDouble(3));
        
    }
    public static int updateNature(Nature nature) throws ClassNotFoundException, SQLException{
        String query = "update NatureOfDeed set name = ?, registrationDuty = ? where natureCode = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, nature.getName(), nature.getRegistrationDuty(), nature.getNatureCode());
    }

    public static int deleteNature(String natureCode) throws SQLException, ClassNotFoundException {
        String query = "delete from NatureOfDeed where natureCode = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, natureCode);
    }
    public static String getNatureCode(String natureName) throws ClassNotFoundException, SQLException{
        String query = "select natureCode from NatureOfDeed where name = '"+natureName+"'";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return resultSet.getString(1);
        
    }
}
