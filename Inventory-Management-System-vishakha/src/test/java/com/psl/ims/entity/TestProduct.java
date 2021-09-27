package com.psl.ims.entity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.web.WebAppConfiguration;

import com.psl.ims.repository.ProductRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
//@WebAppConfiguration
public class TestProduct {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Test
	@Rollback(false)
	public void testCreateProduct() {
		Product product=new Product("iPhone 19",78900,12);
//		Product savedProduct=productRepository.save(product);
		
		assertNotNull(product);
	}
	
	@Test
	public void testFindProductById() {
		Long id=(long) 3;
		Product product=productRepository.getById(id);
		
		assertThat(product.getName()).isNotEqualTo(null);
	}
	
	@Test
	public void testFindProductByNameNotExist() {
		String name="Leno 534";
		Product product=productRepository.findByName(name);
		
		assertNull(product);
	}
	
	@Test
	@Rollback(false)
	public void testUpadateProduct() {
		Product product = productRepository.findById(1L).get();
		product.setName("iphone20");
		
		Product productUpdated= productRepository.save(product);
		Assertions.assertThat(productUpdated.getName()).isEqualTo("iphone20");
		
		
	}
	
	@Test
	public void testListOfProducts() {
		List<Product> list=productRepository.findAll();
		
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	@Rollback(true)
	public void testDeleteProduct() {
		Long id=(long) 1;
		boolean beforeDeleteisPresent=productRepository.findById(id).isPresent();
		
		productRepository.deleteById(id);
		
		boolean AfterDeleteisPresent=productRepository.findById(id).isPresent();
		
		assertTrue(beforeDeleteisPresent);
		assertFalse(AfterDeleteisPresent);
		
	}	

}


