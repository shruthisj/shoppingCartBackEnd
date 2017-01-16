package com.niit.shoppingCartBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingCartBackEnd.dao.ProductDAO;
import com.niit.shoppingCartBackEnd.model.Product;




public class TestProductDAO {
	@Autowired
	static ProductDAO productDAO;
	@Autowired
	static Product product;
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	public TestProductDAO()
	{
	context= new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingCartBackEnd");
	context.refresh();
	productDAO=(ProductDAO)context.getBean("productDAO");
	product=(Product)context.getBean("product");
	
	
		
	}
	
	public void add()
	{
		product.setId("prod_001");
		product.setName("how to win");
		product.setPrice("200");
		product.setDescription("be");
	    
		product.setCategoryId("004");
		
		product.setSupplierId("112");
		product.setStock("6000");
		
		
		productDAO.addProduct(product);
		System.out.println("Product added");
	}
	public static void main(String[] args)
	{
		TestProductDAO testProductDAO=new TestProductDAO();
		testProductDAO.add();
	}
}
