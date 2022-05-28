package com.project.shee.smarthomeenergyefficiency.controllers;

import com.project.shee.smarthomeenergyefficiency.entities.Accounts;
import com.project.shee.smarthomeenergyefficiency.entities.Admin;
import com.project.shee.smarthomeenergyefficiency.repositories.AccountsRepository;
import com.project.shee.smarthomeenergyefficiency.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Accounts")
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    public AccountsController(AccountsRepository repository) {
        this.accountsRepository = repository;
    }

    @PostMapping("/all")
    public @ResponseBody Iterable<Accounts> getAll(){
        // This returns a JSON or XML with the books
        return accountsRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Accounts getAccounts(@PathVariable Integer id) {
        return accountsRepository.findById(id).orElse(null);
    }

    @PostMapping("/save")
    public Accounts createAccounts(@RequestBody Accounts accounts) {
        return accountsRepository.save(accounts);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteAccounts(@PathVariable Integer id) {
        accountsRepository.deleteById(id);
        return true;
    }

    @PutMapping("/save/{id}")
    public Accounts updateAccounts(@PathVariable Integer id, @RequestBody Accounts accounts) {
        return accountsRepository.save(accounts);
    }

}