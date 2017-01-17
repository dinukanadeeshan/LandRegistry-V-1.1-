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
import model.User;

/**
 *
 * @author Nadeeshan
 */
public class UserController {
    public static int addUser(User user) throws ClassNotFoundException, SQLException {
        String query = "insert into User values(?,(select password(?)),?)";
        return DBHandle.setData(DBConnection.getConnection(), query, user.getUserName(), user.getPassword(), user.getPrivilage());
    }
    public static int searchUser(String userName, String password) throws SQLException, ClassNotFoundException {
        String query = "Select privilage from User where userName = '"+userName+"' and password = (select password('"+password+"'))";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        return -1;
    }
    public static boolean isAdministratorPassword(String password) throws ClassNotFoundException, SQLException {
        String query = "select privilage from User where password IN (select password('"+password+"'))";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        while (resultSet.next()) {            
            if (resultSet.getInt(1) == 0) {
                return true;
            }
        }
        return false;
    }
    public static int deleteUser(String userName, String password) throws SQLException, ClassNotFoundException {
        String query  = "delete from User where userName = ? and password = ?";
        return DBHandle.setData(DBConnection.getConnection(), query, userName, password);
    }

    public static ArrayList<User> getUserList() throws ClassNotFoundException, SQLException {
        String query = "Select * from User";
        ResultSet resultSet = DBHandle.getData(DBConnection.getConnection(), query);
        ArrayList<User> userList = new ArrayList<User>();
        while (resultSet.next()) {
            userList.add(new User(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3)));
        }
        return userList;
    }

    public static int changePassword(User user, String newPassword) throws SQLException, ClassNotFoundException {
        String query = "UPDATE User set password = (select password(?)) where userName = ? and password = (select password(?))";
        return DBHandle.setData(DBConnection.getConnection(), query, newPassword, user.getUserName(), user.getPassword());
    }
}
