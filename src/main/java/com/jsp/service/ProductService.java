package com.jsp.service;

import com.jsp.dao.ProductDao;
import com.jsp.dto.Product;

public class ProductService {
	ProductDao productdao=new ProductDao();
	
	public Product saveProduct(Product product) {
		return productdao.saveProduct(product);
	}
	
	public Product deleteProduct(Product product) {
		return productdao.deleteProduct(product);
	}
	
	public Product updateProduct(Product product) {
		return productdao.updateProduct(product);
	}
	
	public Product getProduct(Product product) {
		return productdao.getProduct(product);
	}
	
	public Product getAllProduct(Product product) {
		return productdao.getAllProduct(product);
	}
}