/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Dinuka
 */
public class DBHandle {
    
    public static int setData(Connection connection, String query, Object... data) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        for (int i = 0; i < data.length; i++) {
            preparedStatement.setObject(i+1, data[i]);
        }
        
        return preparedStatement.executeUpdate();
    }
    public static ResultSet getData(Connection connection, String query) throws SQLException{
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(query);
        return rst;   
    }
}
