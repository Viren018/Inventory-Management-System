package com.psl.ims.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "product_name", nullable = false)
	private String product_name;
	
	@Column(name = "product_category", nullable = false)
	private String product_category;
	
	
	 public Product(long id, String product_name, String product_category) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_category = product_category;
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
