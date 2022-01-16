package com.bo.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bo.productsandcategories.models.Category;
import com.bo.productsandcategories.models.Product;
import com.bo.productsandcategories.services.CategoryService;
import com.bo.productsandcategories.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	private ProductService pService;
	
	@Autowired
	private CategoryService cService;
	
	
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard") 
		public String dashboard() {
			return "redirect:/";
	}
	
	
	
	
	@GetMapping("/product")
	public String product(Model viewModel) {
		viewModel.addAttribute("allProducts", this.pService.getAllProducts());
		return "product.jsp";
	}
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("price") String price) {
		Product addProduct = new Product(name, description, price);
		this.pService.createProduct(addProduct);
		return "redirect:/product";
	}
	
	// Show the details of a particular product using the ID
	@GetMapping("/show/{id}")
	public String showProduct(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("showProduct", this.pService.getOneProduct(id));
		viewModel.addAttribute("listOfCategories", this.cService.getAllCategories());
		return "showProducts.jsp";
	}
	
	// Adding a category to a product - Many to Many relationship
	@PostMapping("/addCategoryToProduct/{id}")
	public String addCatToProd(@PathVariable("id") Long id) {
		Category addCatToProduct = this.cService.getOneCategory(id);
		Product productCategory = this.pService.getOneProduct(id);
		// Add the addCatToProduct and productCategory together
		this.pService.addCategoryToProduct(addCatToProduct, productCategory);
		return "showProducts.jsp";
	}
	
	
	
	

	
	
	
	
	@GetMapping("/category")
	public String category(Model viewModel) {
		viewModel.addAttribute("allCategories", this.cService.getAllCategories());
		return "category.jsp";
	}
	
	@PostMapping("/addCategory")
	public String addProduct(@RequestParam("name") String name) {
		Category addCategory = new Category(name);
		this.cService.createCategory(addCategory);
		return "redirect:/category";
	}
	
	@GetMapping("/showCategory/{id}")
	public String showCategory(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("showCategory", this.cService.getOneCategory(id));
		viewModel.addAttribute("listOfProducts", this.pService.getAllProducts());
		return "showCategories.jsp";
	}
	

}

























