package com.project.shee.smarthomeenergyefficiency.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "Hardware")
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hardware_id;

    private Integer controller_id;

    private Integer serial_number;

    private String name;

    private String type;

    private String made_in;

    private Date manufactured;


    //constructor
    public Hardware() {

    }

    //getters and setters
    public Integer getHardware_id() {
        return hardware_id;
    }

    public void setHardware_id(Integer hardware_id) {
        this.hardware_id = hardware_id;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
