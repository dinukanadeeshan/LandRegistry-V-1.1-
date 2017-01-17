/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class Nature {
    private String natureCode;
    private String name;
    private double registrationDuty;

    public Nature() {
    }

    public Nature(String natureCode, String name, double registrationDuty) {
        this.natureCode = natureCode;
        this.name = name;
        this.registrationDuty = registrationDuty;
    }

   

    public String getNatureCode() {
        return natureCode;
    }

    public void setNatureCode(String natureCode) {
        this.natureCode = natureCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public double getRegistrationDuty() {
        return registrationDuty;
    }

    public void setRegistrationDuty(double registrationDuty) {
        this.registrationDuty = registrationDuty;
    }
    
}
