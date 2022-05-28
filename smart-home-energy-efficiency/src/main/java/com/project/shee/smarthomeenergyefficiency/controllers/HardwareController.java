package com.project.shee.smarthomeenergyefficiency.controllers;

import com.project.shee.smarthomeenergyefficiency.entities.Hardware;
import com.project.shee.smarthomeenergyefficiency.entities.RegularUser;
import com.project.shee.smarthomeenergyefficiency.repositories.HardwareRepository;
import com.project.shee.smarthomeenergyefficiency.repositories.RegularUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Hardware")
public class HardwareController {

    @Autowired
    private HardwareRepository hardwareRepository;

    public HardwareController(HardwareRepository repository) {
        this.hardwareRepository = repository;
    }

    @PostMapping("/all")
    public @ResponseBody Iterable<Hardware> getAll(){
        // This returns a JSON or XML with the books
        return hardwareRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Hardware getHardware(@PathVariable Integer id) {
        return hardwareRepository.findById(id).orElse(null);
    }

    @PostMapping("/save")
    public Hardware createHardware(@RequestBody Hardware hardware) {
        return hardwareRepository.save(hardware);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteHardware(@PathVariable Integer id) {
        hardwareRepository.deleteById(id);
        return true;
    }

    @PutMapping("/save/{id}")
    public Hardware updateHardware(@PathVariable Integer id, @RequestBody Hardware hardware) {
        return hardwareRepository.save(hardware);
    }

}
