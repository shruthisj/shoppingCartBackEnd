package com.niit.shoppingCartBackEndJunitTest;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingCartBackEnd.dao.CategoryDAO;
import com.niit.shoppingCartBackEnd.model.Category;

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
	 
//	 @Test
	 public void add()
	 {
		 category.setId("004");
		 category.setName("be books");
		 category.setDescription("this is about books");
		 categoryDAO.addCategory(category);
		 System.out.println("catrgory added");
	 }
	 
	// @Test
	 public void update()
	 {
		 category.setId("004");
		 category.setName("toys");
		 category.setDescription("this is about toys");
		 categoryDAO.updateCategory(category);
		 System.out.println("catrgory updated");
	 }
	// @Test
	 public void listCategory(){
	 //List<Category> c = categoryDAO.list();
		 int size=categoryDAO.list().size();
		 Assert.assertEquals("list",3, size);
	 
		 
	 }	
	 @Test
	 public void deleteCategory(){
		 Assert.assertEquals("delete", true, categoryDAO.deleteCategory("005"));
		  }
}
