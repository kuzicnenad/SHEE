package com.project.shee.smarthomeenergyefficiency.repositories;

import com.project.shee.smarthomeenergyefficiency.entities.RegularUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegularUserRepository extends CrudRepository<RegularUser, Integer> {

}
