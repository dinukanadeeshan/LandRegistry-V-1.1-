/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class Grantee {
    private String geId;
    private String name;
    private String address;

    public Grantee() {
    }

    public Grantee(String geId, String name, String address) {
        this.geId = geId;
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGeId() {
        return geId;
    }

    public void setGeId(String geId) {
        this.geId = geId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
}
