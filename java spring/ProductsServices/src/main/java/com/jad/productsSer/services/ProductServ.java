package com.jad.productsSer.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jad.productsSer.models.Category;
import com.jad.productsSer.models.CategoryProduct;
import com.jad.productsSer.models.Product;
import com.jad.productsSer.repository.CategoryRepo;
import com.jad.productsSer.repository.ProductCategoryRepo;
import com.jad.productsSer.repository.productRepo;

@Service
public class ProductServ {
	
	
	private final productRepo productRepo;
	private final CategoryRepo categoryRepo;
	private final ProductCategoryRepo relationRepo;
	public ProductServ(productRepo productRepo, CategoryRepo categoryRepo , ProductCategoryRepo relationRepo) {
		
		this.productRepo = productRepo;
		this.categoryRepo = categoryRepo;
		this.relationRepo = relationRepo;
	}
	
	
	public Product createProduct(Product p) {
		
		return productRepo.save(p);
		
	}
	
	
	public Category createCategory(Category c) {
		
		return categoryRepo.save(c);
		
	}
	
	
	public List<Product> allProducts(){
		
		return productRepo.findAll();
		
	}
	
	
	public List<Category> allCategory(){
		
		return categoryRepo.findAll();
	}
	
	
	public Product findProduct(Long id) {
		
		return productRepo.findById(id).orElse(null);
		
	}
	
	public Category findCategory(Long id) {
		
		return categoryRepo.findById(id).orElse(null);
	}
	
	
	public List<Product> productsNotContainig(Category cat){
		
		
		return productRepo.findByCategoriesNotContains(cat);		
		
	}
	
	
public List<Category> categoriesNotContainig(Product pro){
		
		
		return categoryRepo.findByProductsNotContains(pro);	 
		
	}


public CategoryProduct createRelation(CategoryProduct k) {
	
	return relationRepo.save(k);
	
}
	
	
		

}
