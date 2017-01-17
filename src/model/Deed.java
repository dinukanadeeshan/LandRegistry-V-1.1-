/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class Deed {
    private String deedId;
    private String dayBookNo;
    private String refVolume;
    private String refFolio;
    private String notryCode;
    private String deedType;
    private String natureCode;
    private String deedDate;
    private int notryNo;
    private String mediumCode;
    private int noOfLands;
    private double deedValue;

    public Deed() {
    }

    public Deed(String deedId, String dayBookNo, String refVolume, String refFolio, String notryCode, String deedType, String natureCode, String deedDate, int notryNo, String mediumCode, int noOfLands, double deedValue) {
        this.deedId = deedId;
        this.dayBookNo = dayBookNo;
        this.refVolume = refVolume;
        this.refFolio = refFolio;
        this.notryCode = notryCode;
        this.deedType = deedType;
        this.natureCode = natureCode;
        this.deedDate = deedDate;
        this.notryNo = notryNo;
        this.mediumCode = mediumCode;
        this.noOfLands = noOfLands;
        this.deedValue = deedValue;
    }

    public double getDeedValue() {
        return deedValue;
    }

    public void setDeedValue(double deedValue) {
        this.deedValue = deedValue;
    }

    public String getDeedId() {
        return deedId;
    }

    public void setDeedId(String deedId) {
        this.deedId = deedId;
    }

    public String getDayBookNo() {
        return dayBookNo;
    }

    public void setDayBookNo(String dayBookNo) {
        this.dayBookNo = dayBookNo;
    }

    public String getRefVolume() {
        return refVolume;
    }

    public void setRefVolume(String refVolume) {
        this.refVolume = refVolume;
    }

    public String getRefFolio() {
        return refFolio;
    }

    public void setRefFolio(String refFolio) {
        this.refFolio = refFolio;
    }

    public String getNotryCode() {
        return notryCode;
    }

    public void setNotryCode(String notryCode) {
        this.notryCode = notryCode;
    }

    public String getDeedType() {
        return deedType;
    }

    public void setDeedType(String deedType) {
        this.deedType = deedType;
    }

    public String getNatureCode() {
        return natureCode;
    }

    public void setNatureCode(String natureCode) {
        this.natureCode = natureCode;
    }

    public String getDeedDate() {
        return deedDate;
    }

    public void setDeedDate(String deedDate) {
        this.deedDate = deedDate;
    }

    public int getNotryNo() {
        return notryNo;
    }

    public void setNotryNo(int notryNo) {
        this.notryNo = notryNo;
    }

    public String getMediumCode() {
        return mediumCode;
    }

    public void setMediumCode(String mediumCode) {
        this.mediumCode = mediumCode;
    }

    public int getNoOfLands() {
        return noOfLands;
    }

    public void setNoOfLands(int noOfLands) {
        this.noOfLands = noOfLands;
    }
    
    
}
