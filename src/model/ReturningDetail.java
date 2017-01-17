/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class ReturningDetail {
    private String dayBookNo;
    private String returningDate;
    private String remark;
    private String clientCode;

    public ReturningDetail() {
    }

    public ReturningDetail(String dayBookNo, String returningDate, String remark, String clientCode) {
        this.dayBookNo = dayBookNo;
        this.returningDate = returningDate;
        this.remark = remark;
        this.clientCode = clientCode;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getDayBookNo() {
        return dayBookNo;
    }

    public void setDayBookNo(String dayBookNo) {
        this.dayBookNo = dayBookNo;
    }

    public String getReturningDate() {
        return returningDate;
    }

    public void setReturningDate(String returningDate) {
        this.returningDate = returningDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
}
