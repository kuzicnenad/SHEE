package com.project.shee.smarthomeenergyefficiency.entities;

import javax.persistence.*;

@Entity
@Table (name = "RegularUser")
public class RegularUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private Integer account_id;

    private Integer controller_id;

    private String street;

    private String city;

    private String region;

    private String phone_num;


    //constructor
    public RegularUser() {

    }

    //getters and setters
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public Integer getController_id() {
        return controller_id;
    }

    public void setController_id(Integer controller_id) {
        this.controller_id = controller_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
}
