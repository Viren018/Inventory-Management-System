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
		
		Product product1 = new Product("iPhone 13", 50000, 8);
		productRepository.save(product1);
		
		Product product2 = new Product("Apple MacBook Pro 13",80000,11);
		productRepository.save(product2);
		
		Product product3 = new Product("iApple iPad Pro 11",35000,22);
		productRepository.save(product3);
		
	}

}
