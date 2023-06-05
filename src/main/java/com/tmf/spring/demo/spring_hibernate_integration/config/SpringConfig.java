package com.tmf.spring.demo.spring_hibernate_integration.config;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.tmf.spring.demo.spring_hibernate_integration.models.Product;

@Configuration
@ComponentScan(basePackages="com.tmf")
@EnableTransactionManagement
public class SpringConfig {
	@Bean
	public BasicDataSource getDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/cijd_13hb");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	public Properties getHibernateProperties() {
		Properties pros = new Properties();
		pros.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		pros.setProperty("hibernate.hbm2ddl.auto", "update");
		pros.setProperty("hibernate.show_sql", "true");
		return pros;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setHibernateProperties(getHibernateProperties());
		sf.setDataSource(getDataSource());
		sf.setAnnotatedClasses(new Class[] {Product.class});
		return sf;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txm = new HibernateTransactionManager();
		txm.setSessionFactory(sessionFactory);
		return txm;
	}
}
