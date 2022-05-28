package com.project.shee.smarthomeenergyefficiency.controllers;

import com.project.shee.smarthomeenergyefficiency.entities.RegularUser;
import com.project.shee.smarthomeenergyefficiency.repositories.RegularUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/RegularUser")
public class RegularUserController {

    @Autowired
    private RegularUserRepository regularUserRepository;

    public RegularUserController(RegularUserRepository repository) {
        this.regularUserRepository = repository;
    }

    @PostMapping("/all")
    public @ResponseBody Iterable<RegularUser> getAll(){
        // This returns a JSON or XML with the books
        return regularUserRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public RegularUser getRegularUser(@PathVariable Integer id) {
        return regularUserRepository.findById(id).orElse(null);
    }

    @PostMapping("/save")
    public RegularUser createRegularUser(@RequestBody RegularUser regularUser) {
        return regularUserRepository.save(regularUser);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteRegularUser(@PathVariable Integer id) {
        regularUserRepository.deleteById(id);
        return true;
    }

    @PutMapping("/save/{id}")
    public RegularUser updateRegularUser(@PathVariable Integer id, @RequestBody RegularUser regularUser) {
        return regularUserRepository.save(regularUser);
    }

}
