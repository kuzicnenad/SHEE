package com.project.shee.smarthomeenergyefficiency.application.entities;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table (name = "Hardware")
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hardware_id;

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
    @Size(max = 20, message = "Name must be greater then 3 and less then 50 characters long.")
    @Pattern(regexp="^[a-zA-ZÀ-ž]*$")
    private String type;

    @NotEmpty
    @CreatedDate
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getManufactured() {
        return manufactured;
    }

    public void setManufactured(Date manufactured) {
        this.manufactured = manufactured;
    }
}
