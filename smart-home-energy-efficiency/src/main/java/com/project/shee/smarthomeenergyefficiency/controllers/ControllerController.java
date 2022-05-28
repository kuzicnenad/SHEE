package com.project.shee.smarthomeenergyefficiency.controllers;

import com.project.shee.smarthomeenergyefficiency.entities.Controller;
import com.project.shee.smarthomeenergyefficiency.entities.Hardware;
import com.project.shee.smarthomeenergyefficiency.repositories.HardwareRepository;
import com.project.shee.smarthomeenergyefficiency.repositories.ControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Controller")
public class ControllerController {

    @Autowired
    private ControllerRepository controllerRepository;

    public ControllerController(ControllerRepository repository) {
        this.controllerRepository = repository;
    }

    @PostMapping("/all")
    public @ResponseBody Iterable<Controller> getAll(){
        // This returns a JSON or XML with the books
        return controllerRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Controller getController(@PathVariable Integer id) {
        return controllerRepository.findById(id).orElse(null);
    }

    @PostMapping("/save")
    public Controller createController(@RequestBody Controller controller) {
        return controllerRepository.save(controller);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteController(@PathVariable Integer id) {
        controllerRepository.deleteById(id);
        return true;
    }

    @PutMapping("/save/{id}")
    public Controller updateController(@PathVariable Integer id, @RequestBody Controller controller) {
        return controllerRepository.save(controller);
    }

}
