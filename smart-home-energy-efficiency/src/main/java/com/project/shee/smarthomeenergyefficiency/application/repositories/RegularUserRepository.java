package com.project.shee.smarthomeenergyefficiency.application.repositories;

import com.project.shee.smarthomeenergyefficiency.application.entities.RegularUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegularUserRepository extends CrudRepository<RegularUser, Integer> {

}
