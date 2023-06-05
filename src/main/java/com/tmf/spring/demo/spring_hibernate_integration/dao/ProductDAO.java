package com.tmf.spring.demo.spring_hibernate_integration.dao;

import java.util.List;

import com.tmf.spring.demo.spring_hibernate_integration.models.Product;

public interface ProductDAO {
	public void addProduct(Product pro);
	public List<Product> displayAllProducts();
	public List<Product> displayAllProductsByCategory(String category);
	public Product displayProductById(long productId);
	public void updateProduct(Product pro);
	public void deleteProduct(Product pro);
}
