package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class TestUpdateProduct {
	public static void main(String[] args) {
	
		Product product=new Product();
		if(product!=null) {
			product.setId(1);
			product.setBrand("Sony");
			product.setName("Bravia");
			product.setType("Smart Tv");
			product.setPrice(50000);
		
		ProductService productService=new ProductService();
			
		productService.updateProduct(product);
		}
	}
}