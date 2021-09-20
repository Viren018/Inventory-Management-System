package com.psl.ims;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.psl.ims.entity.Product;
import com.psl.ims.repository.ProductRepository;

@SpringBootApplication
public class InventoryManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemApplication.class, args);
	}
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Product product1 = new Product(1,"iPhone 13","iPhone");
		productRepository.save(product1);
		
		Product product2 = new Product(2,"Apple MacBook Pro 13","iMac");
		productRepository.save(product2);
		
		Product product3 = new Product(3,"iApple iPad Pro 11","iPad");
		productRepository.save(product3);
		
	}

}
