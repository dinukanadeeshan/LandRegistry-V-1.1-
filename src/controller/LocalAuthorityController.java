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
import java.util.Vector;
import model.LocalAuthority;

/**
 *
 * @author Nadeeshan
 */
public class LocalAuthorityController {
    public static Vector<LocalAuthority> getLocalAuthorityies() throws ClassNotFoundException, SQLException{
        String query = "select * from LocalAuthority";
        ResultSet rst = DBHandle.getData(DBConnection.getConnection(), query);
        Vector<LocalAuthority> localAuthorities = new Vector<LocalAuthority>();
        while(rst.next()){
            localAuthorities.add(new LocalAuthority(rst.getString(1), rst.getString(2)));
        }
        return localAuthorities;
    }
    public static ArrayList<String> getLocalAuthorityList() throws SQLException, ClassNotFoundException{
        String query = "select name from LocalAuthority";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> authorityList = new ArrayList<String>();
        while (resultSet.next()) {
            authorityList.add(resultSet.getString(1));
        }
        return authorityList;
    }
    public static LocalAuthority getLocalAuthority (String LACode) throws ClassNotFoundException, SQLException, NullPointerException{
        String query = "select * from LocalAuthority where authorityCode = '"+LACode+"'";
        ResultSet rst = DBHandle.getData(DBConnection.getConnection(), query);
        LocalAuthority localAuthority = null;
        if (rst.next()) {
            localAuthority = new LocalAuthority(rst.getString(1), rst.getString(2));
            return localAuthority;
        }
      return localAuthority;
    }
    public static String getLocalAuthorityCode(String name) throws ClassNotFoundException, SQLException {
        String query = "select authorityCode from LocalAuthority where name = '"+name+"' ";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return resultSet.getString(1);
    }
     public static LocalAuthority getLocalAuthorityOfVillage(String VCode) throws SQLException, ClassNotFoundException{
         String query = "select authorityCode from VillageOrTown where villageCode = '"+VCode+"'";
        ResultSet rst = DBHandle.getData(DBConnection.getConnection(), query);
       rst.next();
       return LocalAuthorityController.getLocalAuthority(rst.getString(1));
        
     }

    public static int addLocalAuthority(LocalAuthority localAuthority) throws ClassNotFoundException, SQLException {
        String query = "insert into LocalAuthority values(?, ?)";
        return DBHandle.setData(DBConnection.getConnection(), query, localAuthority.getAuthorityCode(), localAuthority.getName());
    }

    public static int deleteAuthority(String authorityCode) throws ClassNotFoundException, SQLException {
        String query = "delete from LocalAuthority where authorityCode = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, authorityCode);
    }

    public static int updateAuthority(LocalAuthority localAuthority) throws SQLException, ClassNotFoundException {
        String query = "update LocalAuthority set name = ? where authorityCode = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, localAuthority.getName(), localAuthority.getAuthorityCode());
    }
}
