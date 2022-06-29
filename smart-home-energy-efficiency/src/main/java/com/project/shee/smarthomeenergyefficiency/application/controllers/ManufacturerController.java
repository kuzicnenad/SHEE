package com.project.shee.smarthomeenergyefficiency.application.controllers;

import com.project.shee.smarthomeenergyefficiency.application.entities.Manufacturer;
import com.project.shee.smarthomeenergyefficiency.application.repositories.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ManufacturerController {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public ManufacturerController(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @GetMapping(path = "/Manufacturer")
    public @ResponseBody Iterable<Manufacturer> getAll(){
        // This returns a JSON or XML with the books
        return manufacturerRepository.findAll();
    }

    @GetMapping(path = "/Manufacturer/{id}")
    public Manufacturer getManufacturer(@PathVariable Integer id) {
        return manufacturerRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "/Manufacturer")
    public Manufacturer createManufacturer(@RequestBody Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    @DeleteMapping(path = "/Manufacturer/{id}")
    public boolean deleteManufacturer(@PathVariable Integer id) {
        manufacturerRepository.deleteById(id);
        return true;
    }

    @PutMapping(path = "/Manufacturer/{id}")
    public Manufacturer updateManufacturer(@PathVariable Integer id, @RequestBody Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

}
