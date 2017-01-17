/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import db.DBHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Grantor;

/**
 *
 * @author Nadeeshan
 */
public class GrantorController {
    public static Grantor getGrantor(String grId) throws ClassNotFoundException, SQLException{
        String query = "select * from Grantor where GrId = '"+grId+"'";
        ResultSet data = DBHandle.getData(DBConnection.getConnection(), query);
        data.next();
        return  new Grantor(data.getString(1), data.getString(2), data.getString(3));
        
    }
}
