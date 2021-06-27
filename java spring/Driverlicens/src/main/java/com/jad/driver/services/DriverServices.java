package com.jad.driver.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jad.driver.models.Person;
import com.jad.driver.repositories.PersonRepository;

@Service
public class DriverServices {

	private final PersonRepository personRepo;

	public DriverServices(PersonRepository personRepo) {
		
		this.personRepo = personRepo;
	}
	
	public Person addNew(Person s) {
		
		return personRepo.save(s);
			
	}
	
	
	
	public  Person findperson(Long id) {
		
		return personRepo.findById(id).orElse(null);
		
		
	}
	
	
	
	public List<Person> alllicense(){
		
		return personRepo.findByLicenseIdIsNull();
	}
	public List<Person> showall(){
		return personRepo.findByLicenseIdIsNull();
	}
	
	
	
}
