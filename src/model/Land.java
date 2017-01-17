/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class Land {
    private String villageCode;
    private String landCode;
    private String name;
    private String lotNo;
    private String volume;
    private int folio;
    private String parentLand;

    public Land() {
    }

    public Land(String villageCode, String landCode, String name, String lotNo, String volume, int folio) {
        this.villageCode = villageCode;
        this.landCode = landCode;
        this.name = name;
        this.lotNo = lotNo;
        this.volume = volume;
        this.folio = folio;
    }

    public Land(String villageCode, String landCode, String name, String lotNo, String volume, int folio, String parentLand) {
        this.villageCode = villageCode;
        this.landCode = landCode;
        this.name = name;
        this.lotNo = lotNo;
        this.volume = volume;
        this.folio = folio;
        this.parentLand = parentLand;
    }

    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }

    public String getLandCode() {
        return landCode;
    }

    public void setLandCode(String landCode) {
        this.landCode = landCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getParentLand() {
        return parentLand;
    }

    public void setParentLand(String parentLand) {
        this.parentLand = parentLand;
    }

    @Override
    public String toString() {
        return landCode +" - " +name;
    }
    
   
}
