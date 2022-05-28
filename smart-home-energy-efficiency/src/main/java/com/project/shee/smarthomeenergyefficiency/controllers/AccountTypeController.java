package com.project.shee.smarthomeenergyefficiency.controllers;

import com.project.shee.smarthomeenergyefficiency.entities.AccountType;
import com.project.shee.smarthomeenergyefficiency.repositories.AccountTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AccountTypeController {

    @Autowired
    private AccountTypeRepository accountTypeRepository;

    public AccountTypeController(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository = accountTypeRepository;
    }

    @GetMapping(path = "/AccountType")
    public @ResponseBody Iterable<AccountType> getAll(){
        // This returns a JSON or XML with the books
        return accountTypeRepository.findAll();
    }

    @GetMapping(path = "/AccountType/{id}")
    public AccountType getAccounts(@PathVariable Integer id) {
        return accountTypeRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "/AccountType")
    public AccountType createAccounts(@RequestBody AccountType accountType) {
        return accountTypeRepository.save(accountType);
    }

    @DeleteMapping(path = "/AccountType/{id}")
    public boolean deleteAccounts(@PathVariable Integer id) {
        accountTypeRepository.deleteById(id);
        return true;
    }

    @PutMapping(path = "/AccountType/{id}")
    public AccountType updateAccounts(@PathVariable Integer id, @RequestBody AccountType accountType) {
        return accountTypeRepository.save(accountType);
    }

}