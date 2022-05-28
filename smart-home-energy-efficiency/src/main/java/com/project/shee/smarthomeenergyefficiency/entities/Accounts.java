package com.project.shee.smarthomeenergyefficiency.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "Accounts")
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer AccountID;

    private String Email;

    private String Password;

    private Date Registered;

    public Integer getAccountID() {
        return AccountID;
    }

    public void setAccountID(Integer accountID) {
        AccountID = accountID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getRegistered() {
        return Registered;
    }

    public void setRegistered(Date registered) {
        Registered = registered;
    }
}
