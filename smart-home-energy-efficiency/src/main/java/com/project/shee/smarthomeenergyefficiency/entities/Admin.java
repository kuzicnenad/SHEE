package com.project.shee.smarthomeenergyefficiency.entities;


import javax.persistence.*;

@Entity
@Table (name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer AdminID;

    private Integer AccountID;

    private String AdminName;

    private String Location;

    public Integer getAdminID() {
        return AdminID;
    }

    public void setAdminID(Integer adminID) {
        AdminID = adminID;
    }

    public Integer getAccountID() {
        return AccountID;
    }

    public void setAccountID(Integer accountID) {
        AccountID = accountID;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}