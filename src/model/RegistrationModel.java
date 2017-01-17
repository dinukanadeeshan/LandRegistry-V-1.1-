/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Nadeeshan
 */
public class RegistrationModel {
    private String deedId;
    private String landCode;
    private String remark;
    private Date registeredDate;

    public RegistrationModel() {
    }

    public RegistrationModel(String deedId, String landCode, String remark, Date registeredDate) {
        this.deedId = deedId;
        this.landCode = landCode;
        this.remark = remark;
        this.registeredDate = registeredDate;
    }

    public String getDeedId() {
        return deedId;
    }

    public void setDeedId(String deedId) {
        this.deedId = deedId;
    }

    public String getLandCode() {
        return landCode;
    }

    public void setLandCode(String landCode) {
        this.landCode = landCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

      
}
