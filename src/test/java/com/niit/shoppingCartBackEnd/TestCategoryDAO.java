package com.niit.shoppingCartBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingCartBackEnd.dao.CategoryDAO;
import com.niit.shoppingCartBackEnd.model.Category;




public class TestCategoryDAO {
	@Autowired
	static CategoryDAO categoryDAO;
	@Autowired
	static Category category;
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	public TestCategoryDAO()
	{
	context= new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingCartBackEnd");
	context.refresh();
	categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	category=(Category)context.getBean("category");
	
	
		
	}
	
	public void add()
	{
		category.setId("007");
		category.setName("books");
		category.setDescription("be");
		categoryDAO.addCategory(category);
		System.out.println("category");
	}
	public static void main(String[] args)
	{
		TestCategoryDAO testCategoryDAO=new TestCategoryDAO();
//		testCategoryDAO.add();
		testCategoryDAO.testbyname();
	}

	public void testbyname()
	{
		category = categoryDAO.getCategoryName("philosophy");
		System.out.println(category.getId());
	}
}
