package com.project.shee.smarthomeenergyefficiency.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table (name = "AccountType")
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty
    @Size(max = 15)
    private Integer type_id;

    @NotEmpty
    @NotEmpty
    @Size(max = 15)
    private String account_type;

    //constructor
    public AccountType() {

    }

    //getters and setters
    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
}
