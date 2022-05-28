package com.project.shee.smarthomeenergyefficiency.entities;


import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.sql.Date;

@Entity
@Table (name = "Accounts")
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer account_id;

    private Integer type_id;

    @NotEmpty
    @Size(min = 3, max = 50, message = "Name must be greater then 3 and less then 50 characters long.")
    @Pattern(regexp="^[a-zA-ZÀ-ž]*$")
    private String name;

    @NotEmpty
    @Email(message = "Please insert valid email address.")
    private String email;

    @NotEmpty
    @Size(min = 8, max = 50, message = "Password must be at least 8 and less then 50 characters long.")
    @Pattern(regexp="(?=.*?[0-9])(?=.*?[A-Za-z])(?=.*[^0-9A-Za-z]).+", message = "Password must contain at least one digit, one letter and one special character")
    private String password;

    @NotNull(message = "Insert valid date.")
    @CreatedDate
    private Date registered;

    // Constructor
    public Accounts() {

    }

    // getters and setters

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }
}
