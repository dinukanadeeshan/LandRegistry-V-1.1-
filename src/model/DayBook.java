/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class DayBook {
    private String dayBookNo;
    private String recDate;
    private String recTime;
    private String clientCode;
    private double  registrationDuty;

    public DayBook() {
    }

    public DayBook(String dayBookNo, String recDate, String recTime, String clientCode, double registrationDuty) {
        this.dayBookNo = dayBookNo;
        this.recDate = recDate;
        this.recTime = recTime;
        this.clientCode = clientCode;
        this.registrationDuty = registrationDuty;
    }

    public String getDayBookNo() {
        return dayBookNo;
    }

    public void setDayBookNo(String dayBookNo) {
        this.dayBookNo = dayBookNo;
    }

    

    public String getRecDate() {
        return recDate;
    }

    public void setRecDate(String recDate) {
        this.recDate = recDate;
    }

    public String getRecTime() {
        return recTime;
    }

    public void setRecTime(String recTime) {
        this.recTime = recTime;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public double getRegistrationDuty() {
        return registrationDuty;
    }

    public void setRegistrationDuty(double registrationDuty) {
        this.registrationDuty = registrationDuty;
    }
    
}
