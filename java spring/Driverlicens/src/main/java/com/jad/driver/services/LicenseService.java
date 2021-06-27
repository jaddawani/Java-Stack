package com.jad.driver.services;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.jad.driver.models.License;
import com.jad.driver.repositories.LicenseRepository;

@Service
public class LicenseService {
	
	
	private final LicenseRepository licenseRepo;

	public LicenseService(LicenseRepository licenseRepo) {
		
		this.licenseRepo = licenseRepo;
	}

public License addNew(License w) {
	Random rand = new Random();
	Integer n = rand.nextInt(50);
		System.out.println(w.getNumber());
		w.setNumber(n.toString());
		return licenseRepo.save(w);
			
	}

public  License findlicense(Long id) {
	
	return licenseRepo.findById(id).orElse(null);
	
	
}






}
