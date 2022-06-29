package com.project.shee.smarthomeenergyefficiency.application.controllers;

import com.project.shee.smarthomeenergyefficiency.application.entities.RegularUser;
import com.project.shee.smarthomeenergyefficiency.application.repositories.RegularUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RegularUserController {

    @Autowired
    private RegularUserRepository regularUserRepository;

    public RegularUserController(RegularUserRepository regularUserRepository) {
        this.regularUserRepository = regularUserRepository;
    }

    @GetMapping(path = "/RegularUser")
    public @ResponseBody Iterable<RegularUser> getAll(){
        // This returns a JSON or XML with the books
        return regularUserRepository.findAll();
    }

    @GetMapping(path = "/RegularUser/{id}")
    public RegularUser getRegularUser(@PathVariable Integer id) {
        return regularUserRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "/RegularUser")
    public RegularUser createRegularUser(@RequestBody RegularUser regularUser) {
        return regularUserRepository.save(regularUser);
    }

    @DeleteMapping(path = "/RegularUser/{id}")
    public boolean deleteRegularUser(@PathVariable Integer id) {
        regularUserRepository.deleteById(id);
        return true;
    }

    @PutMapping(path = "/RegularUser/{id}")
    public RegularUser updateRegularUser(@PathVariable Integer id, @RequestBody RegularUser regularUser) {
        return regularUserRepository.save(regularUser);
    }

}
