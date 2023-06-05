package com.tmf.spring.demo.spring_hibernate_integration.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tmf.spring.demo.spring_hibernate_integration.models.Product;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sf;
	
	public Session getSession() {
		return sf.getCurrentSession();
	}
	
	@Override
	public void addProduct(Product pro) {
		// TODO Auto-generated method stub
		getSession().merge(pro);
	}

	@Override
	public List<Product> displayAllProducts() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Product").list();
	}

	@Override
	public List<Product> displayAllProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product displayProductById(long productId) {
		// TODO Auto-generated method stub
		return getSession().get(Product.class, productId);
	}

	@Override
	public void updateProduct(Product pro) {
		// TODO Auto-generated method stub
		getSession().merge(pro);
	}

	@Override
	public void deleteProduct(Product pro) {
		// TODO Auto-generated method stub
		getSession().delete(pro);
	}

}
