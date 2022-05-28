package com.project.shee.smarthomeenergyefficiency.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "Controller")
public class Controller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer controller_id;

    private Integer serial_number;

    private String firmware;

    private String software;

    private String made_in;

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

    public Integer getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(Integer serial_number) {
        this.serial_number = serial_number;
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

    public String getMade_in() {
        return made_in;
    }

    public void setMade_in(String made_in) {
        this.made_in = made_in;
    }

    public Date getManufactured() {
        return manufactured;
    }

    public void setManufactured(Date manufactured) {
        this.manufactured = manufactured;
    }

}
