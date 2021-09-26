package com.psl.ims.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.psl.ims.entity.Product;
import com.psl.ims.repository.ProductRepository;
import com.psl.ims.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
	
	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findOne(id) ;
	}

	@Override
	public Product updateProduct(Product product) {

		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(Long id) {
		// TODO Auto-generated method stub
		productRepository.delete(id);
	}

	
	
	
}
