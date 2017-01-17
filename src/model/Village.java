/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class Village {
    private String villageCode;
    private String authorityCode;
    private String name;

    public Village() {
    }

    public Village(String villageCode, String authorityCode, String name) {
        this.villageCode = villageCode;
        this.authorityCode = authorityCode;
        this.name = name;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }

    public void setAuthorityCode(String authorityCode) {
        this.authorityCode = authorityCode;
    }

    public String getAuthorityCode() {
        return authorityCode;
    }

    @Override
    public String toString() {
        return villageCode + " - " + name;
    }
    
}
