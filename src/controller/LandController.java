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
import model.Boundary;
import model.Extent;
import model.Land;
import model.Plan;
import model.Village;

/**
 *
 * @author Nadeeshan
 */
public class LandController {

    public static int addLand(Land land, Village village, Extent extent, Boundary boundary, Plan plan) throws ClassNotFoundException, SQLException {

        Connection connection = null;
        int res1 = -1, res2 = -1, res3 = -1;
        try {
            connection = DBConnection.getConnection();
            connection.setAutoCommit(false);
            res1 = ExtentController.addExtent(extent);

            res2 = BoundaryController.addBoundary(boundary);
            String query;
            try {
                land.getParentLand().equals(null);
                query = "insert into Land(landCode, volume, folio, name, villageCode, boundryId, ExtId, lotNo, parentLand) values(?,?,?,?,?,?,?,?,?)";
                res3 = DBHandle.setData(connection, query, new Object[]{land.getLandCode(), land.getVolume(), land.getFolio(), land.getName(),
                            village.getVillageCode(), boundary.getBoundaryId(), extent.getExtentId(), land.getLotNo(), land.getParentLand()});
            } catch (NullPointerException ex) {
                query = "insert into Land(landCode, volume, folio, name, villageCode, boundryId, ExtId, lotNo) values(?,?,?,?,?,?,?,?)";
                res3 = DBHandle.setData(connection, query, new Object[]{land.getLandCode(), land.getVolume(), land.getFolio(), land.getName(),
                            village.getVillageCode(), boundary.getBoundaryId(), extent.getExtentId(), land.getLotNo()});
            }
               
            connection.commit();
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        } finally {
            connection.setAutoCommit(true);
        }
        if (res1 > 0 && res2 > 0 && res3 > 0) {
            return 1;
        }
        return -1;
    }

    public static ArrayList<String> getLandInfo(String volume, int folio) throws ClassNotFoundException, SQLException {
        String query = "select l.name as Land_Name, la.name as Local_Authority, v.name as Village_Name, e.acre, e.rood, e.perch, b.north, b.west, b.east, b.south, l.landCode, l.parentLand "
                + "from Land l, Extent e, Boundry b, VillageOrTown v, LocalAuthority la "
                + "where l.boundryId = b.boundryId and e.ExtId = l.ExtId and l.villageCode = v.villageCode and la.authorityCode = v.authorityCode and l.volume = '" + volume + "' and l.folio = " + folio;
        ArrayList<String> landInfo = new ArrayList<String>();
        ResultSet rst = DBHandle.getData(DBConnection.getConnection(), query);
        rst.next();
        for (int i = 1; i <= 12; i++) {
            landInfo.add(rst.getString(i));
        }
        return landInfo;
    }

    public static int removeLand(String landCode) throws ClassNotFoundException, SQLException {
        String query = "delete from Land where landCode = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, landCode);
    }

    public static boolean isLandRegistered(String landCode) throws ClassNotFoundException, SQLException {
        String query = "select registeredDate from Registration r where r.landCode = " + landCode + "";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        return resultSet.next();
    }

    public static int updateLand(Land land) {
        return 0;
    }

    public static ArrayList<String> getLandCodeList() throws ClassNotFoundException, SQLException {
        String query = "select landCode from Land";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> landCodeList = new ArrayList<String>();
        while (resultSet.next()) {
            landCodeList.add(resultSet.getString(1));
        }
        return landCodeList;
    }

    public static Land getLand(String landCode) throws ClassNotFoundException, SQLException {
        String query = "select * from Land where landCode = '" + landCode + "'";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return new Land(resultSet.getString(5), resultSet.getString(1), resultSet.getString(4), resultSet.getString(8), resultSet.getString(2), resultSet.getInt(3));
    }

    public static String getLandCode(String volume, int folio) throws ClassNotFoundException, SQLException {
        String query = "select landCode from Land where volume = '" + volume + "' and folio = " + folio;
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return resultSet.getString(1);
    }
    public static String getVillageCodeOfLand(String volume, int folio) throws SQLException, ClassNotFoundException{
        String query = "select v.villageCode from villageortown v where v.villageCode IN (select l.villageCode from land l where volume = '"+volume+"' and folio = "+folio+")";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        resultSet.next();
        return resultSet.getString(1);
    }

    public static ArrayList<ArrayList<String>> getSplitedLandInfo(String landCode) throws ClassNotFoundException, SQLException {
        String query = "select landCode, volume, folio, name from Land where parentLand = '"+landCode+"'";
        ArrayList<ArrayList<String>> splitLandInfoList = new ArrayList<ArrayList<String>>();
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        while (resultSet.next()) {
            ArrayList<String> splitLandInfo = new ArrayList<String>();
            splitLandInfo.add(resultSet.getString(1));
            splitLandInfo.add(resultSet.getString(2));
            splitLandInfo.add(resultSet.getString(3));
            splitLandInfo.add(resultSet.getString(4));
            splitLandInfoList.add(splitLandInfo);
        }
        return splitLandInfoList;
    }
}