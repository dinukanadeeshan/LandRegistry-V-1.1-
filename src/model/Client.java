/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dinuka
 */
public class Client {
    private String clientCode;
    private String name;
    private String address;
    

    public Client() {
    }

    public Client(String clientCode, String name, String address) {
        this.clientCode = clientCode;
        this.name = name;
        this.address = address;
    }

    public String getClientId() {
        return clientCode;
    }

    public void setClientId(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}