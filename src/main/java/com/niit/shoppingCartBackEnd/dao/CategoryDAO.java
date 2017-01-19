package com.niit.shoppingCartBackEnd.dao;

import java.util.List;

import com.niit.shoppingCartBackEnd.model.Category;

public interface CategoryDAO 
{
	public List<Category> list();

	public boolean updateCategory(Category category);

	public boolean addCategory(Category category);

	public boolean deleteCategory(String id);
	
	public Category getCategory(String id);
	
	public Category getCategoryName(String name);
	
	

}
