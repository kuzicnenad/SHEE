package com.project.shee.smarthomeenergyefficiency.application.repositories;

import com.project.shee.smarthomeenergyefficiency.application.entities.Hardware;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardwareRepository extends CrudRepository<Hardware, Integer> {
}
