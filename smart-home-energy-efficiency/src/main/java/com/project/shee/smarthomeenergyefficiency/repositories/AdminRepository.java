package com.project.shee.smarthomeenergyefficiency.repositories;

import com.project.shee.smarthomeenergyefficiency.entities.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {
}
