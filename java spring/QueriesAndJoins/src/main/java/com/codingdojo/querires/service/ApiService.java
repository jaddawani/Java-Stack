package com.codingdojo.querires.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.querires.repositories.CityRepository;
import com.codingdojo.querires.repositories.CountryRepositary;
import com.codingdojo.querires.repositories.LanguageRepositary;

@Service
public class ApiService {
	private final CityRepository cityRepository;
	private final CountryRepositary countryRepository;
	private final LanguageRepositary languageRepositary;
	public ApiService(CityRepository cityRepository, CountryRepositary countryRepository,
			LanguageRepositary languageRepositary) {
		this.cityRepository = cityRepository;
		this.countryRepository = countryRepository;
		this.languageRepositary = languageRepositary;
	}
	
	
	public List<Object[]> countriesSpeak(){
		
		return countryRepository.countriesSpeaksSlovene();
		
	}
	public List<Object[]> numberOfCitiesForEachCountry(){
		return cityRepository.numberOfCitiesForEachCountry();
	}
	
	
	public List<Object[]> Query4(){
		
		return languageRepositary.allLanguagesInEachCountryWithApercentage();
		
	}
	}
	
	
	

