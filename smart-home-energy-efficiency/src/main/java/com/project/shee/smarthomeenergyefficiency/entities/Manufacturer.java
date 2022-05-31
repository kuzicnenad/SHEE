package com.project.shee.smarthomeenergyefficiency.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Manufacturer")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer manufacturer_id;

    @NotEmpty
    @Size(max = 30)
    @Pattern(regexp="^[a-zA-ZÀ-ž]*$")
    private String manufacturer;

    @Size(max = 30)
    @Pattern(regexp="^[a-zA-ZÀ-ž]*$")
    private String location;

    //constructor
    public Manufacturer() {

    }

    //getters and setters
    public Integer getManufacturer_id() {
        return manufacturer_id;
    }

    public void setManufacturer_id(Integer manufacturer_id) {
        this.manufacturer_id = manufacturer_id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
