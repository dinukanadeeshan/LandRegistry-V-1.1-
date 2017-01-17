/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dinuka
 */
public class Notry {
    private String notryCode;
    private String name;
    private String address;
    private boolean sinhalaMedium;
    private boolean englishMedium;
    private boolean tamilMedium;
    private String notryOrJudge;
    private String dateOfAppointment;
    private String gender;
    private String officeCode;

    public Notry() {
    }

    public Notry(String notryCode, String name, String address, boolean sinhalaMedium, boolean englishMedium, boolean tamilMedium, String notryOrJudge, String dateOfAppointment, String gender, String officeCode) {
        this.notryCode = notryCode;
        this.name = name;
        this.address = address;
        this.sinhalaMedium = sinhalaMedium;
        this.englishMedium = englishMedium;
        this.tamilMedium = tamilMedium;
        this.notryOrJudge = notryOrJudge;
        this.dateOfAppointment = dateOfAppointment;
        this.gender = gender;
        this.officeCode = officeCode;
    }

    public Notry(String notryCode, String name, String address, String notryOrJudge, String dateOfAppointment, String gender, String officeCode) {
        this.notryCode = notryCode;
        this.name = name;
        this.address = address;
        this.notryOrJudge = notryOrJudge;
        this.dateOfAppointment = dateOfAppointment;
        this.gender = gender;
        this.officeCode = officeCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNotryCode(String notryCode) {
        this.notryCode = notryCode;
    }

    
    
    public void setName(String name) {
        this.name = name;
    }

   
    public void setEnglishMedium(boolean englishMedium) {
        this.englishMedium = englishMedium;
    }

    public void setSinhalaMedium(boolean sinhalaMedium) {
        this.sinhalaMedium = sinhalaMedium;
    }

    public void setTamilMedium(boolean tamilMedium) {
        this.tamilMedium = tamilMedium;
    }

    

    public void setNotryOrJudge(String notryOrJudge) {
        this.notryOrJudge = notryOrJudge;
    }

    public void setDateOfAppointment(String dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

   
    public String getNotryCode() {
        return notryCode;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

 
   
    public String getName() {
        return name;
    }

    
    public boolean isEnglishMedium() {
        return englishMedium;
    }

    public boolean isSinhalaMedium() {
        return sinhalaMedium;
    }

    public boolean isTamilMedium() {
        return tamilMedium;
    }

    

    
    public String getNotryOrJudge() {
        return notryOrJudge;
    }

    public String getDateOfAppointment() {
        return dateOfAppointment;
    }

    @Override
    public String toString() {
        return notryCode + " - " + name ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
