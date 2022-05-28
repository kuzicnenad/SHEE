package com.project.shee.smarthomeenergyefficiency.controllers;

import com.project.shee.smarthomeenergyefficiency.entities.Hardware;
import com.project.shee.smarthomeenergyefficiency.repositories.HardwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HardwareController {

    @Autowired
    private HardwareRepository hardwareRepository;

    public HardwareController(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }

    @GetMapping(path = "/Hardware")
    public @ResponseBody Iterable<Hardware> getAll(){
        // This returns a JSON or XML with the books
        return hardwareRepository.findAll();
    }

    @GetMapping(path = "/Hardware/{id}")
    public Hardware getHardware(@PathVariable Integer id) {
        return hardwareRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "/Hardware")
    public Hardware createHardware(@RequestBody Hardware hardware) {
        return hardwareRepository.save(hardware);
    }

    @DeleteMapping(path = "/Hardware/{id}")
    public boolean deleteHardware(@PathVariable Integer id) {
        hardwareRepository.deleteById(id);
        return true;
    }

    @PutMapping(path = "/Hardware/{id}")
    public Hardware updateHardware(@PathVariable Integer id, @RequestBody Hardware hardware) {
        return hardwareRepository.save(hardware);
    }

}
