package com.project.shee.smarthomeenergyefficiency.application.controllers;

import com.project.shee.smarthomeenergyefficiency.application.repositories.AdminRepository;
import com.project.shee.smarthomeenergyefficiency.application.entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @GetMapping(path = "/Admin")
    public @ResponseBody Iterable<Admin> getAll(){
        // This returns a JSON or XML with the books
        return adminRepository.findAll();
    }

    @GetMapping(path = "/Admin/{id}")
    public Admin getAdmin(@PathVariable Integer id) {
        return adminRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "/Admin")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }

    @DeleteMapping(path = "/Admin/{id}")
    public boolean deleteAdmin(@PathVariable Integer id) {
        adminRepository.deleteById(id);
        return true;
    }

    @PutMapping(path = "/Admin/{id}")
    public Admin updateAdmin(@PathVariable Integer id, @RequestBody Admin admin) {
        return adminRepository.save(admin);
    }

}
