package com.project.shee.smarthomeenergyefficiency.application.repositories;

import com.project.shee.smarthomeenergyefficiency.application.entities.Accounts;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Integer> {

    Optional<Accounts> findByAccounts   (String username);

    @Transactional
    @Modifying
    @Query("UPDATE Accounts a " +
            "SET a.enabled = TRUE WHERE a.username = ?1")
    int enableAccountUser(String username);


}
