package com.niit.shoppingCartBackEndJunitTest;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingCartBackEnd.dao.ProductDAO;
import com.niit.shoppingCartBackEnd.model.Product;

public class junitProductDAO {

	@Autowired
	static ProductDAO productDAO;
	
	@Autowired
	static Product product;
	
	 @Autowired
	 static AnnotationConfigApplicationContext context;
	 
	 @BeforeClass
	 public static void initialize()
		{
			context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.shoppingCartBackEnd");
			context.refresh();
			productDAO = (ProductDAO) context.getBean("productDAO");
			product = (Product) context.getBean("product");
			
		}
	 
	// @Test
	 public void add()
	 {
		product.setId("pro_002"); 
		product.setName("wings of fire");
		product.setDescription("by Sir ABJ Abdul Kalam");
		product.setCategoryId("004");
		product.setSupplierId("112");
		product.setStock("9000000");
		System.out.println("product 'book' added");
		
	 }
	 
	 @Test
	 public void update()
	 {
		 product.setId("pro_001"); 
			product.setName("how to win");
			product.setDescription("by shiv patil");
			product.setCategoryId("004");
			product.setSupplierId("112");
			product.setStock("8999999");
			System.out.println("product updated");
	 }
	// @Test
	 public void listPoduct(){
	 
		 int size=productDAO.list().size();
		 Assert.assertEquals("list",1, size);
	 
		 
	 }	
	// @Test
	 public void deleteProduct(){
		 Assert.assertEquals("delete", true, productDAO.deleteProduct("pro_002"));
		  }
}
