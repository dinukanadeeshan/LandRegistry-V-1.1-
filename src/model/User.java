/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class User {
    private String userName;
    private String password;
    private int privilage;

    public User() {
    }

    public User(String userName, String password, int privilage) {
        this.userName = userName;
        this.password = password;
        this.privilage = privilage;
    }

    public int getPrivilage() {
        return privilage;
    }

    public void setPrivilage(int privilage) {
        this.privilage = privilage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
