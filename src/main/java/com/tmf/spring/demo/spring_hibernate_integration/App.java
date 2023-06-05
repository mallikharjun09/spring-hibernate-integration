package com.tmf.spring.demo.spring_hibernate_integration;

import java.sql.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tmf.spring.demo.spring_hibernate_integration.config.SpringConfig;
import com.tmf.spring.demo.spring_hibernate_integration.models.Product;
import com.tmf.spring.demo.spring_hibernate_integration.services.ProductServices;
import com.tmf.spring.demo.spring_hibernate_integration.services.ProductServicesImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ProductServices service = context.getBean(ProductServicesImpl.class);
        
        //Product pro = new Product(1,"Special Comb",45.00,"Fashion",
        	//Date.valueOf("2023-01-02"),Date.valueOf("2025-01-02"));
        
        Product p = service.displayProductById(2);
        System.out.println(p);
        
    }
}
