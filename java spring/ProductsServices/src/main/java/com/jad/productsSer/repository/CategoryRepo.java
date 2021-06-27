package com.jad.productsSer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jad.productsSer.models.Category;
import com.jad.productsSer.models.Product;



@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {
	
	
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
}
