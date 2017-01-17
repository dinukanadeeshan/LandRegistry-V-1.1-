/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class Office {
    String officeCode;
    String name;

    public Office() {
    }

    public Office(String officeCode, String name) {
        this.officeCode = officeCode;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }
    
}
