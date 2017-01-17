/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import db.DBHandle;
import java.sql.SQLException;
import model.ReturningDetail;

/**
 *
 * @author Nadeeshan
 */
public class ReturningDetailController {
    public static int addReturnigDetail(ReturningDetail returningDetail) throws ClassNotFoundException, SQLException{
        String query = "insert into ReturningDetail values(?,?,?,?)";
        return DBHandle.setData(DBConnection.getConnection(), query, returningDetail.getDayBookNo(), returningDetail.getReturningDate(), returningDetail.getRemark(), returningDetail.getClientCode());
    }
}
