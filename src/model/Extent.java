/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class Extent {
    private String extentId;
    private double perch;
    private double acre;
    private double rood;

    public Extent() {
    }

    public Extent(String extentId, double perch, double acre, double rood) {
        this.extentId = extentId;
        this.perch = perch;
        this.acre = acre;
        this.rood = rood;
    }

    public double getRood() {
        return rood;
    }

    public void setRood(double rood) {
        this.rood = rood;
    }

    public String getExtentId() {
        return extentId;
    }

    public void setExtentId(String extentId) {
        this.extentId = extentId;
    }

    public double getPerch() {
        return perch;
    }

    public void setPerch(double perch) {
        this.perch = perch;
    }

    public double getAcre() {
        return acre;
    }

    public void setAcre(double acre) {
        this.acre = acre;
    }
    
}
