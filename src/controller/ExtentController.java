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
import model.Extent;

/**
 *
 * @author Nadeeshan
 */
class ExtentController {
    public static int addExtent(Extent extent) throws ClassNotFoundException, SQLException{
        String query = "insert into Extent values(?,?,?,?)";
        return DBHandle.setData(DBConnection.getConnection(), query, new Object[]{extent.getExtentId(), extent.getAcre(), extent.getRood(), extent.getPerch()});
    }
    public static ArrayList<String> getExtIdList() throws ClassNotFoundException, SQLException{
        String query = "select ExtId from Extent";
        ResultSet rst = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> idList = new ArrayList<String>();
        while(rst.next()){
            idList.add(rst.getString(1));
        }
        return idList;
        
    }
}
