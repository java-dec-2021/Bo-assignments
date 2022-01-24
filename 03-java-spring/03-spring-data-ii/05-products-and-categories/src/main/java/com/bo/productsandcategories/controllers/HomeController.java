package com.bo.productsandcategories.controllers;

import javax.servlet.http.HttpSession;

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
	@GetMapping("/show/{productId}")
	public String showProduct(@PathVariable("productId") Long id, Model viewModel, HttpSession session) {

		Product productInSession = this.pService.getOneProduct(id);
		session.setAttribute("product__id", productInSession.getId());		
		viewModel.addAttribute("showProduct", this.pService.getOneProduct(id));
		viewModel.addAttribute("listOfCategories", this.cService.getAllCategories());
		
		
		return "showProducts.jsp";
	}
	
	
	// Adding a category to a product - Many to Many relationship
	@PostMapping("/addCategoryToProduct")
	public String addCategory(@RequestParam("categoryName") Long id, HttpSession session) {
//		Long prodId = (Long)session.getAttribute("product__id");
		Product prod = this.pService.getOneProduct((Long)session.getAttribute("product__id"));
		Category cat = this.cService.getOneCategory(id);
		this.pService.addCategoryToProduct(cat, prod);
		return "redirect:/product";
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
	public String showCategory(@PathVariable("id") Long id, Model viewModel, HttpSession session) {
		Category categoryInSession = this.cService.getOneCategory(id);
		session.setAttribute("category__id", categoryInSession.getId());
		
		
		viewModel.addAttribute("showCategory", this.cService.getOneCategory(id));
		viewModel.addAttribute("listOfProducts", this.pService.getAllProducts());
		return "showCategories.jsp";
	}

	
	
	
	// Adding a product to a category - Many to Many relationship
	@PostMapping("/addProductToCategory") 
	public String addProduct(@RequestParam("productName") Long id, HttpSession session) {
		Category category = this.cService.getOneCategory((Long)session.getAttribute("category__id"));
		Product product = this.pService.getOneProduct(id);
		this.cService.addProductToCategory(product, category);
		return "redirect:/category";
	}
	
	
	
	
	

}

























