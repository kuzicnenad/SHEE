package com.project.shee.smarthomeenergyefficiency.application.repositories;

import com.project.shee.smarthomeenergyefficiency.application.entities.Manufacturer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer> {

}
