package com.tmf.spring.demo.spring_hibernate_integration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tmf.spring.demo.spring_hibernate_integration.dao.ProductDAO;
import com.tmf.spring.demo.spring_hibernate_integration.models.Product;



@Service

public class ProductServicesImpl implements ProductServices {

	@Autowired
	private ProductDAO dao;
	
	
	@Override
	public void addProduct(Product pro) {
		// TODO Auto-generated method stub
		dao.addProduct(pro);
	}

	@Override
	public List<Product> displayAllProducts() {
		// TODO Auto-generated method stub
		return dao.displayAllProducts();
	}

	@Override
	public List<Product> displayAllProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return dao.displayAllProductsByCategory(category);
	}

	@Override
	public Product displayProductById(long productId) {
		// TODO Auto-generated method stub
		return dao.displayProductById(productId);
	}

	@Override
	public void updateProduct(Product pro) {
		// TODO Auto-generated method stub
		dao.updateProduct(pro);
	}

	@Override
	public void deleteProduct(Product pro) {
		// TODO Auto-generated method stub
		dao.deleteProduct(pro);
	}

}
