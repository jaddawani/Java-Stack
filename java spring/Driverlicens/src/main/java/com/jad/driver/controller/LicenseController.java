package com.jad.driver.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jad.driver.models.License;
import com.jad.driver.models.Person;
import com.jad.driver.services.DriverServices;
import com.jad.driver.services.LicenseService;

@Controller	
public class LicenseController {
	
	
	private final LicenseService licenes;
	private final DriverServices persons;
	
	
	
	public LicenseController(LicenseService licenes , DriverServices persons ) {
		
		this.licenes = licenes;
		this.persons = persons;
	}


	@RequestMapping("/license/new")
	public String renderHome(@ModelAttribute("license")License license,Model model) {
		model.addAttribute("persons",persons.showall());
		return "license.jsp";
	}
	
	
	
	@RequestMapping("/license/news")
	public String newLic(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
			return "license.jsp";
		} else {
			
			licenes.addNew(license);
			
			
			return "redirect:/profile/"+license.getPerson().getId();
		}
			

	}
	
	@RequestMapping("/profile/{id}")
	public String profile(@PathVariable("id") Long id){
		licenes.findlicense(id);
		return "profile.jsp";
	}
	
	
	@RequestMapping("/person/{id}")
	public String profile(@PathVariable("id") Long id, Model model) {
		
		Person b = persons.findperson(id);
		License license = b.getLicense();
		System.out.println(license);
		model.addAttribute("Person" , b.getLastName());
		
		
		
		
		
	
		return "profile.jsp";
}
	
	
}
