package com.project.shee.smarthomeenergyefficiency.application.entities;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table (name = "Controller")
public class Controller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer controller_id;

    @NotEmpty
    private Integer manufacturer_id;

    @NotEmpty
    @Size(min = 16, max = 16, message = "Serial number is 16 characters long.")
    @Pattern(regexp="^[A-Za-z0-9]*$")
    private String serial_number;

    @NotEmpty
    @Size(min = 3, max = 50, message = "Name must be greater then 3 and less then 50 characters long.")
    @Pattern(regexp="^[a-zA-ZÀ-ž]*$")
    private String name;

    @NotEmpty
    @Size(max = 8)
    @Pattern(regexp = "^[0-9.]*$")
    private String firmware;

    @NotEmpty
    @Size(max = 8)
    @Pattern(regexp = "^[0-9.]*$")
    private String software;

    @NotEmpty
    @CreatedDate
    private Date manufactured;

    //constructor
    public Controller() {

    }

    //getters and setters
    public Integer getController_id() {
        return controller_id;
    }

    public void setController_id(Integer controller_id) {
        this.controller_id = controller_id;
    }

    public Integer getManufacturer_id() {
        return manufacturer_id;
    }

    public void setManufacturer_id(Integer manufacturer_id) {
        this.manufacturer_id = manufacturer_id;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public Date getManufactured() {
        return manufactured;
    }

    public void setManufactured(Date manufactured) {
        this.manufactured = manufactured;
    }
}
