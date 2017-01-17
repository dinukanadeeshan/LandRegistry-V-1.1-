/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import db.DBHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Client;

/**
 *
 * @author Dinuka
 */
public class ClientController {
    public static int addClient(Client client) throws ClassNotFoundException, SQLException{
        String query = "insert into Client values(?,?,?)";
        return DBHandle.setData(DBConnection.getConnection(), query, new Object[]{client.getClientId(), client.getName(), client.getAddress()});
    }
    /**
     *
     * @param code
     * @return Client
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static Client searchClientByCode(String code) throws SQLException, ClassNotFoundException{
        String query = "select * from Client where clientCode = '"+code+"'";
        ResultSet rs = DBHandle.getData(DBConnection.getConnection(), query);
        rs.next();
        return new Client(rs.getString(1), rs.getString(2), rs.getString(3));
    }
    public static Client searchClientByName(String name) throws SQLException, ClassNotFoundException{
        String query = "select * from Client where name = '"+name+"'";
        ResultSet rs = DBHandle.getData(DBConnection.getConnection(), query);
        rs.next();
        return new Client(rs.getString(1), rs.getString(2), rs.getString(3));
    }
    public static Client searchClientByAddress(String address) throws SQLException, ClassNotFoundException{
        String query = "select * from Client where address = '"+address+"'";
        ResultSet rs = DBHandle.getData(DBConnection.getConnection(), query);
        rs.next();
        return new Client(rs.getString(1), rs.getString(2), rs.getString(3));
    }
    public static Client getClient(String dayBookNo) throws ClassNotFoundException, SQLException{
        String query = "select * from Client where clientCode In (Select clientCode from DayBookRecord where dayBookNo = '"+dayBookNo+"')";
        ResultSet rs = DBHandle.getData(DBConnection.getConnection(), query);
        rs.next();
        return new Client(rs.getString(1), rs.getString(2), rs.getString(3));
    }
}