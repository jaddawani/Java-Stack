package com.codingdojo.querires.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.querires.models.Country;

@Repository
public interface CountryRepositary extends CrudRepository<Country, Long> {
	List<Country> findAll();
	
	@Query(value = "select language, percentage, countries.name FROM languages \r\n"
			+ "INNER JOIN countries ON countries.id = languages.country_id\r\n" + "where language =\"Slovene\"\r\n"
			+ "ORDER BY percentage DESC;\r\n" + "", nativeQuery = true)
	List<Object[]> countriesSpeaksSlovene();

}
