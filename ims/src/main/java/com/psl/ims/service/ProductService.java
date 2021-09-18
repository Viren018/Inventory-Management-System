package com.psl.ims.service;

import java.util.List;

import com.psl.ims.entity.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	
	Product saveProduct(Product product);
	
}
