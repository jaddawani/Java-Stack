package com.codingdojo.querires.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.querires.service.ApiService;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
public class QueriesController {
	private final ApiService apiService;

	public QueriesController(ApiService apiService) {
		this.apiService = apiService;
	}
	@RequestMapping("/")
	public String handler(Model model) {
		
		List <Object[]> speaks = apiService.countriesSpeak();
		List <Object[]> query2 = apiService.numberOfCitiesForEachCountry();
		List <Object[]> query4 = apiService.Query4();
		
		
		model.addAttribute("query4", query4);
		model.addAttribute("query2", query2);
		model.addAttribute("Speaks", speaks);
		return "index.jsp";
		
	}
	

}
