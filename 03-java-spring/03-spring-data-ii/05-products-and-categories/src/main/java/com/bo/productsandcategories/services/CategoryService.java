package com.bo.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.productsandcategories.models.Category;
import com.bo.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	
	public List<Category> getAllCategories() {
		return this.cRepo.findAll();
	}
	
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	public Category getOneCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	

}


































