/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class Boundary {
    private String boundaryId;
    private String north;
    private String west;
    private String east;
    private String south;

    public Boundary() {
    }
    
    
    public Boundary(String boundaryId, String north, String west, String east, String south) {
        this.boundaryId = boundaryId;
        this.north = north;
        this.west = west;
        this.east = east;
        this.south = south;
    }

    public String getSouth() {
        return south;
    }

    public void setSouth(String south) {
        this.south = south;
    }

    public String getBoundaryId() {
        return boundaryId;
    }

    public void setBoundaryId(String boundaryId) {
        this.boundaryId = boundaryId;
    }

    public String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public String getWest() {
        return west;
    }

    public void setWest(String west) {
        this.west = west;
    }

    public String getEast() {
        return east;
    }

    public void setEast(String east) {
        this.east = east;
    }
    
}
