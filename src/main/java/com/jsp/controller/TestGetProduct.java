package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class TestGetProduct {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		Product product=new Product();
		product.setId(2);
		productService.getProduct(product);
	}
}