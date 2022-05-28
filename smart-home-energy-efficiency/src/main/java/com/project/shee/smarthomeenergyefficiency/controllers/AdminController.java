package com.project.shee.smarthomeenergyefficiency.controllers;

import com.project.shee.smarthomeenergyefficiency.entities.Admin;
import com.project.shee.smarthomeenergyefficiency.entities.Controller;
import com.project.shee.smarthomeenergyefficiency.repositories.AdminRepository;
import com.project.shee.smarthomeenergyefficiency.repositories.ControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Admin")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    public AdminController(AdminRepository repository) {
        this.adminRepository = repository;
    }

    @PostMapping("/all")
    public @ResponseBody Iterable<Admin> getAll(){
        // This returns a JSON or XML with the books
        return adminRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Admin getAdmin(@PathVariable Integer id) {
        return adminRepository.findById(id).orElse(null);
    }

    @PostMapping("/save")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteAdmin(@PathVariable Integer id) {
        adminRepository.deleteById(id);
        return true;
    }

    @PutMapping("/save/{id}")
    public Admin updateAdmin(@PathVariable Integer id, @RequestBody Admin admin) {
        return adminRepository.save(admin);
    }

}
