package com.psl.ims.service;

import java.util.List;

import com.psl.ims.entity.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	
	Product saveProduct(Product product);

	Product getProductById(Long id);

	Product updateProduct(Product product);

	void deleteProductById(Long id);

//	Product getProductById(int id);
	
}
