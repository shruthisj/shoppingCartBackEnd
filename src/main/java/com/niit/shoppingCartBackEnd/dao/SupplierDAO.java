package com.niit.shoppingCartBackEnd.dao;

import java.util.List;

import com.niit.shoppingCartBackEnd.model.Supplier;

public interface SupplierDAO {
	
	public List<Supplier> list();
	
	public boolean addSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
	public boolean deleteSupplier(String id);

}
