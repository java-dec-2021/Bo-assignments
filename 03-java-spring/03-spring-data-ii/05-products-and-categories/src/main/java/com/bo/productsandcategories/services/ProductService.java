package com.bo.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.productsandcategories.models.Category;
import com.bo.productsandcategories.models.Product;
import com.bo.productsandcategories.repositories.CategoryRepository;
import com.bo.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
	@Autowired 
	private CategoryRepository cRepo;
	
	public List<Product> getAllProducts() {
		return this.pRepo.findAll();
	}
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public Product getOneProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	// Add category to product - Many to Many relationship
	public void addCategoryToProduct(Category category, Product product) {
		product.getCategories().add(category);
		pRepo.save(product);
	}
	
	
	
	
	
	
	public List<Category> findCategoriesNotInProduct(Product product) {
		return cRepo.findByProductsNotContains(product);
	}
	

}































































