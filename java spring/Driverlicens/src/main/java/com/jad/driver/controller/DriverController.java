package com.jad.driver.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jad.driver.models.Person;
import com.jad.driver.services.DriverServices;

@Controller
public class DriverController {
	
	private final DriverServices driverservice;

	public DriverController(DriverServices driverservice) {
		
		this.driverservice = driverservice;
	}
	
	@RequestMapping("/")
	public String renderHome(@ModelAttribute Person person) {
		return "home.jsp";
	}
	
	
	@RequestMapping(value = "/person/new", method = RequestMethod.POST)
	public String addNew(@Valid @ModelAttribute Person person, BindingResult result) {

		if (result.hasErrors()) {
			return "home.jsp";
		} else {
			driverservice.addNew(person);
			return "redirect:/license/new";
		}

	}
	
	
//	@RequestMapping("/person/{id}")
//	public String renderInfo(Model model, @PathVariable("id") Long id) {
//		model.addAttribute("person", driverservice.get(id).get());
//		return "home.jsp";
//	}
//	
	
	

}
