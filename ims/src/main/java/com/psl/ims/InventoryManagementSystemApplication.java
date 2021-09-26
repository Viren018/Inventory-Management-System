package com.psl.ims;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.psl.ims.entity.Product;
import com.psl.ims.repository.ProductRepository;

@SuppressWarnings("unused")
@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class InventoryManagementSystemApplication{

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemApplication.class, args);
	}
	
//	@Autowired
//	private ProductRepository productRepository;
//	
//	public void run(String... args) throws Exception {
//		
////		
//		
//	}

}
