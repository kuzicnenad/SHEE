package com.project.shee.smarthomeenergyefficiency.application.controllers;

import com.project.shee.smarthomeenergyefficiency.application.entities.Controller;
import com.project.shee.smarthomeenergyefficiency.application.repositories.ControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ControllerController {

    @Autowired
    private ControllerRepository controllerRepository;

    public ControllerController(ControllerRepository controllerRepository) {
        this.controllerRepository = controllerRepository;
    }

    @GetMapping(path = "/Controller")
    public @ResponseBody Iterable<Controller> getAll(){
        // This returns a JSON or XML with the books
        return controllerRepository.findAll();
    }

    @GetMapping(path = "/Controller/{id}")
    public Controller getController(@PathVariable Integer id) {
        return controllerRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "/Controller")
    public Controller createController(@RequestBody Controller controller) {
        return controllerRepository.save(controller);
    }

    @DeleteMapping(path = "/Controller/{id}")
    public boolean deleteController(@PathVariable Integer id) {
        controllerRepository.deleteById(id);
        return true;
    }

    @PutMapping(path = "/Controller/{id}")
    public Controller updateController(@PathVariable Integer id, @RequestBody Controller controller) {
        return controllerRepository.save(controller);
    }

}
