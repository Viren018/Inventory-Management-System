package com.psl.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.psl.ims.entity.Product;
import com.psl.ims.service.ProductService;

@Controller
public class ProductController {
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	//handler method to handle list student and return model and view
	
	@GetMapping("/products")
	public String listProducts(Model model )
	{
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}
	
	@GetMapping("/products/new")
	public String addProductForm(Model model )
	{
		//create new object to hold product form data
		Product product = new Product(); 
		model.addAttribute("product", product);
		return "add_product";
	}
	
	@PostMapping("/products")
	public String saveProduct(@ModelAttribute("product") Product product)
	{
		productService.saveProduct(product);
		return "redirect:/products";
	}
}
