package com.project.shee.smarthomeenergyefficiency.entities;

import javax.persistence.*;

@Entity
@Table (name = "RegularUser")
public class RegularUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UserID;

    private Integer AccountID;

    private Integer ControllerID;

    private String UserName;

    private String Street;

    private String City;

    private String PhoneNum;

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public Integer getAccountID() {
        return AccountID;
    }

    public void setAccountID(Integer accountID) {
        AccountID = accountID;
    }

    public Integer getControllerID() {
        return ControllerID;
    }

    public void setControllerID(Integer controllerID) {
        ControllerID = controllerID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }
}
