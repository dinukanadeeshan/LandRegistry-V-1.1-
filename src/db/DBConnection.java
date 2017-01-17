/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Dinuka
 */
public class DBConnection {
    static private DBConnection dbConnection;
    private Connection connection;
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Properties properties  = new Properties();
        properties.put("autoReconnect", "true");
        properties.put("roundRobinLoadBalance", "true");
        properties.put("user", "root");
        properties.put("password", "123");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/LandRegistry", properties);
        
    }
    private static DBConnection getDBConnection() throws ClassNotFoundException, SQLException{
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        return getDBConnection().connection;
    }
}
