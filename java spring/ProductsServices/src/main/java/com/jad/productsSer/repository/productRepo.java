package com.jad.productsSer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jad.productsSer.models.Category;
import com.jad.productsSer.models.Product;



@Repository
public interface productRepo extends CrudRepository<Product, Long> {

	
	List<Product> findAll();
	
	List<Product> findByCategoriesNotContains(Category category);
	
}
