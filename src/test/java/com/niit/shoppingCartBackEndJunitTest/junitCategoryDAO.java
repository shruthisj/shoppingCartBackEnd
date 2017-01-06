package com.niit.shoppingCartBackEndJunitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingCartBackEnd.dao.CategoryDAO;
import com.niit.shoppingCartBackEnd.dao.UserDAO;
import com.niit.shoppingCartBackEnd.model.Category;
import com.niit.shoppingCartBackEnd.model.User;

public class junitCategoryDAO {

	@Autowired
	static CategoryDAO categoryDAO;
	
	@Autowired
	static Category category;
	
	 @Autowired
	 static AnnotationConfigApplicationContext context;
	 
	 @BeforeClass
	 public static void initialize()
		{
			context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.shoppingCartBackEnd");
			context.refresh();
			categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
			category = (Category) context.getBean("category");
			
		}
	 
	 @Test
	 public void add()
	 {
		 category.setId("001");
		 category.setName("books");
		 category.setDescription("this is about books");
		 System.out.println("catrgory added");
	 }
	 

}
