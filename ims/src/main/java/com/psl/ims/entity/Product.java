package com.psl.ims.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import groovy.transform.builder.Builder;

@Builder
@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="product_code", nullable=false)
	private int product_code;
	
	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	@Column(name = "product_name", nullable = false)
	private String product_name;
	
	@Column(name = "product_category", nullable = false)
	private String product_category;
	
	@Column(name="product_price", nullable = false)
	private int product_price;
	
	@Column(name="quantity", nullable = false)
	private int quantity;
	
	
	 public Product(long id, String product_name, String product_category, int string, int string2) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_category = product_category;
		this.product_price= string2;
		this.quantity=string;
	}

	public Product(String product_name, int product_price, int quantity) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}


}
