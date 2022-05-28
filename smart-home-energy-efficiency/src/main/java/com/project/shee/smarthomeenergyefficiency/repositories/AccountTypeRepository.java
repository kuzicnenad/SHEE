package com.project.shee.smarthomeenergyefficiency.repositories;

import com.project.shee.smarthomeenergyefficiency.entities.AccountType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends CrudRepository<AccountType, Integer> {
}
