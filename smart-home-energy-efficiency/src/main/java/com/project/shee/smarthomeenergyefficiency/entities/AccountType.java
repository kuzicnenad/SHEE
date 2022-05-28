package com.project.shee.smarthomeenergyefficiency.entities;

import javax.persistence.*;

@Entity
@Table (name = "AccountType")
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer account_type;

    private Integer account_id;

    //constructor
    public AccountType() {
    }

    //getters and setters
    public Integer getAccount_type() {
        return account_type;
    }

    public void setAccount_type(Integer account_type) {
        this.account_type = account_type;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }
}
