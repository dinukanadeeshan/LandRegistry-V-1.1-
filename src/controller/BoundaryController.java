/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import db.DBHandle;
import java.sql.SQLException;
import model.Boundary;

/**
 *
 * @author Nadeeshan
 */
class BoundaryController {
    public static int addBoundary(Boundary boundary) throws ClassNotFoundException, SQLException{
        String query = "insert into Boundry values(?,?,?,?,?)";
        return DBHandle.setData(DBConnection.getConnection(), query, new Object[]{boundary.getBoundaryId(), boundary.getSouth(), boundary.getNorth(), boundary.getWest(), boundary.getEast()});
        
    }
}
