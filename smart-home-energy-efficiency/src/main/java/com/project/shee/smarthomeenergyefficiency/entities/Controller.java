package com.project.shee.smarthomeenergyefficiency.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "Controller")
public class Controller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ControllerID;

    private Integer SerialNumber;

    private String Firmware;

    private String Software;

    private String MadeIn;

    private Date Manufactured;

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

    public String getFirmware() {
        return Firmware;
    }

    public void setFirmware(String firmware) {
        Firmware = firmware;
    }

    public String getSoftware() {
        return Software;
    }

    public void setSoftware(String software) {
        Software = software;
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
