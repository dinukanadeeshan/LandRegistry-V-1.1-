/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nadeeshan
 */
public class LocalAuthority {
    private String authorityCode;
    private String name;

    public LocalAuthority() {
    }

    
    public LocalAuthority(String authorityCode, String name) {
        this.authorityCode = authorityCode;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(String localAuthorityCode) {
        this.authorityCode = localAuthorityCode;
    }

    @Override
    public String toString() {
        return authorityCode + " - " + name;
    }
    
}
