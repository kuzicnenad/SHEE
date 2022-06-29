package com.project.shee.smarthomeenergyefficiency.application.repositories;

import com.project.shee.smarthomeenergyefficiency.application.entities.Controller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControllerRepository extends CrudRepository<Controller, Integer> {
}
