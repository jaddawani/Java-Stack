package com.jad.driver.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jad.driver.models.Person;


@Repository
public interface PersonRepository extends CrudRepository <Person , Long> {
	
	List <Person> findByLicenseIdIsNull();
	List<Person> findAll();

}
