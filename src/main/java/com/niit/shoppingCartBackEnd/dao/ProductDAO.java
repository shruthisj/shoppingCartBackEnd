package com.niit.shoppingCartBackEnd.dao;

import java.util.List;

import com.niit.shoppingCartBackEnd.model.Product;
import com.niit.shoppingCartBackEnd.model.Supplier;

public interface ProductDAO {
	
	public List<Product> list();
	 
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(String id);
	public Product getProduct(String id);

}
