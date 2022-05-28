package com.project.shee.smarthomeenergyefficiency.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "Hardware")
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer HardwareID;

    private Integer ControllerID;

    private Integer SerialNumber;

    private String Name;

    private String Type;

    private String MadeIn;

    private Date Manufactured;

    public Integer getHardwareID() {
        return HardwareID;
    }

    public void setHardwareID(Integer hardwareID) {
        HardwareID = hardwareID;
    }

    public Integer getControllerID() {
        return ControllerID;
    }

    public void setControllerID(Integer controllerID) {
        ControllerID = controllerID;
    }

    public Integer getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        SerialNumber = serialNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getMadeIn() {
        return MadeIn;
    }

    public void setMadeIn(String madeIn) {
        MadeIn = madeIn;
    }

    public Date getManufactured() {
        return Manufactured;
    }

    public void setManufactured(Date manufactured) {
        Manufactured = manufactured;
    }
}
