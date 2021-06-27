package com.jad.productsSer.repository;

import org.springframework.data.repository.CrudRepository;

import com.jad.productsSer.models.CategoryProduct;

public interface ProductCategoryRepo extends CrudRepository<CategoryProduct, Long> {

}
