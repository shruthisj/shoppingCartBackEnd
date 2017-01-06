package com.niit.shoppingCartBackEnd.dao;

import java.util.List;

import com.niit.shoppingCartBackEnd.model.Category;
import com.niit.shoppingCartBackEnd.model.User;

public interface CategoryDAO 
{
	public List<Category> list();

	public Category updateCategory(Category category);

	public boolean addCategory(Category category);

	public boolean deleteCategory(String id);

}
