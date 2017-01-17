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

/**
 *
 * @author Nadeeshan
 */
public class BookTypeController {
    public static ArrayList<String> getDeedTypes() throws ClassNotFoundException, SQLException{
        String query = "select * from BookType";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<String> types = new ArrayList();
        for (int i = 0; resultSet.next(); i++) {
            types.add(resultSet.getString(2));
        }
        return types;
        
    }
}
