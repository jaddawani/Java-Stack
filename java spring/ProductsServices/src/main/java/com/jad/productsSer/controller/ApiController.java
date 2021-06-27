package com.jad.productsSer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jad.productsSer.models.Category;
import com.jad.productsSer.models.CategoryProduct;
import com.jad.productsSer.models.Product;
import com.jad.productsSer.services.ProductServ;

@Controller
public class ApiController {

	private final ProductServ productserv;

	public ApiController(ProductServ productserv) {
	
		this.productserv = productserv;
	}
	
	
	@RequestMapping("/")
	public String back() {
		
		return "redirect:/product/new";
	}
	
	@RequestMapping("/product/new")
	public String product(@ModelAttribute("product") Product product) {
		
		return "product.jsp";
	}
	
@PostMapping("/kalb")
public String createProduct(@Valid  @ModelAttribute("product") Product product , BindingResult result) {
	if(result.hasErrors()) {
	return "product.jsp";
}
	else 
		
		productserv.createProduct(product);
	
	
return "redirect:/products/" + product.getId();
		
}


@RequestMapping("/products/{id}")
	
	public String showProduct(Model model , @PathVariable("id") Long id, @ModelAttribute("relation") CategoryProduct relation  ){

	model.addAttribute("product1", productserv.findProduct(id) );

	model.addAttribute("category1", productserv.categoriesNotContainig(productserv.findProduct(id)));
	
	return "showProduct.jsp"; 	
	
	}


@RequestMapping("/category/new")
public String category(@ModelAttribute("category") Category category) { 
	return "category.jsp";
	}


@PostMapping("/beseh")
public String createCategory(@Valid  @ModelAttribute("category") Category category , BindingResult result) {
	 if(result.hasErrors()) {
		return "category.jsp";
	 }
		else 
			
			productserv.createCategory(category);
	return "redirect:/category/"+ category.getId();
			
	}


@RequestMapping("/category/{id}")
public String showCategory(Model model , @PathVariable("id") Long id , @ModelAttribute("relation") CategoryProduct relation) {
	
	model.addAttribute("category2", productserv.findCategory(id) );
	model.addAttribute("product2", productserv.productsNotContainig(productserv.findCategory(id)) );
	return "showCategory.jsp";
			
	}

@PostMapping("/product/addCategory")

public String addrelation(@Valid @ModelAttribute("relation") CategoryProduct relation, BindingResult result) {
	
	
	if(result.hasErrors())
		return "showProduct.jsp";
				
		else 
			
		productserv.createRelation(relation);
	return "redirect:/products/"+relation.getProduct().getId();
		
	
}



@PostMapping("/category/addProduct")

public String addrelations(@Valid @ModelAttribute("relation") CategoryProduct relation, BindingResult result) {
	
	
	if(result.hasErrors())
		return "showCategory.jsp";
				
		else 
			
		productserv.createRelation(relation);
	return "redirect:/category/"+relation.getCategory().getId();
		
	
	
	
}




}




