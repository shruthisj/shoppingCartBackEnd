package com.niit.shoppingCartBackEndJunitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingCartBackEnd.dao.SupplierDAO;
import com.niit.shoppingCartBackEnd.dao.UserDAO;
import com.niit.shoppingCartBackEnd.model.Supplier;
import com.niit.shoppingCartBackEnd.model.User;

public class junitSupplierDAO {

	@Autowired
	static SupplierDAO supplierDAO;
	
	@Autowired
	static Supplier supplier;
	
	 @Autowired
	 static AnnotationConfigApplicationContext context;
	 
	 @BeforeClass
	 public static void initialize()
		{
			context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.shoppingCartBackEnd");
			context.refresh();
			supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
			supplier = (Supplier) context.getBean("supplier");
			
		}
	 
	 @Test
	 public void add()
	 {
		 supplier.setId("001");
		 supplier.setName("shobha");
		 supplier.setDescription("printed in blg");
		 System.out.println("supplier added");
	 }
	 

}
