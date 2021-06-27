package com.codingdojo.querires.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.querires.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	List<City> findAll();
	
	@Query(value = "select  countries.name as country, count(countries.id) as total_cities FROM cities \r\n"
			+ "INNER JOIN countries ON countries.id = cities.country_id\r\n"
			+ "group by countries.id \r\n"
			+ "ORDER BY count(countries.id) DESC;" + "", nativeQuery = true)
	List<Object[]> numberOfCitiesForEachCountry();


}
