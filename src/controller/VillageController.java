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
import model.Village;

/**
 *
 * @author Nadeeshan
 */
public class VillageController {
    public static int addVillage(Village village) throws ClassNotFoundException, SQLException{
        String query = "insert into VillageOrTown values(?,?,?)";
        
        return DBHandle.setData(DBConnection.getConnection(), query, village.getAuthorityCode(), village.getVillageCode(), village.getName());
    }
    public static ArrayList<Village> getVillages() throws ClassNotFoundException, SQLException{
        String query = "select * from VillageOrTown";
        ResultSet rst = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<Village> villages = new ArrayList<Village>();
        while(rst.next()){
            villages.add(new Village(rst.getString(2),rst.getString(1), rst.getString(3)));
        }
        return villages;
    }
     public static Vector<Village> getVillages(String localAuthority) throws ClassNotFoundException, SQLException{
        String query = "select * from VillageOrTown where authorityCode = '"+localAuthority+"'";
        ResultSet rst = DBHandle.getData(DBConnection.getConnection(), query);
        Vector<Village> villages = new Vector<Village>();
        while(rst.next()){
            villages.add(new Village(rst.getString(2), rst.getString(1), rst.getString(3)));
        }
        return villages;
    }
    public static int deleteVillage(String villageCode) throws SQLException, ClassNotFoundException{
        String query = "delete from VillageOrTown where villageCode = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, villageCode);
    }
    public static Village searchVillage(String villageCode) throws SQLException, ClassNotFoundException {
        String query = "select * from VillageOrTown where villageCode = '"+villageCode+"'";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return  new Village(resultSet.getString(2), resultSet.getString(1), resultSet.getString(3));
    }
    public static ArrayList<String> getVillageCodeList() throws SQLException, ClassNotFoundException{
        String query = "select villageCode from VillageOrTown";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> villageCodeList = new ArrayList<String>();
        while (resultSet.next()) {            
            villageCodeList.add(resultSet.getString(1));
        }
        return villageCodeList;
    }

    public static int updateVillage(Village village) throws SQLException, ClassNotFoundException {
        String query = "update VillageOrTown set authorityCode = ?, name = ? where villageCode = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, village.getAuthorityCode(), village.getName(), village.getVillageCode());
    }
    
}
