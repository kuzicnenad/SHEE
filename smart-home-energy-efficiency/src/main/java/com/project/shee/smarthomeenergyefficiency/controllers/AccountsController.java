package com.project.shee.smarthomeenergyefficiency.controllers;

import com.project.shee.smarthomeenergyefficiency.entities.Accounts;
import com.project.shee.smarthomeenergyefficiency.repositories.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    public AccountsController(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    @GetMapping(path = "/Accounts")
    public @ResponseBody Iterable<Accounts> getAll(){
        // This returns a JSON or XML with the books
        return accountsRepository.findAll();
    }

    @GetMapping(path = "/Accounts/{id}")
    public Accounts getAccounts(@PathVariable Integer id) {
        return accountsRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "/Accounts")
    public Accounts createAccounts(@RequestBody Accounts accounts) {
        return accountsRepository.save(accounts);
    }

    @DeleteMapping(path = "/Accounts/{id}")
    public boolean deleteAccounts(@PathVariable Integer id) {
        accountsRepository.deleteById(id);
        return true;
    }

    @PutMapping(path = "/Accounts/{id}")
    public Accounts updateAccounts(@PathVariable Integer id, @RequestBody Accounts accounts) {
        return accountsRepository.save(accounts);
    }

}