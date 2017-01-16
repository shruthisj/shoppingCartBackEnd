package com.niit.shoppingCartBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingCartBackEnd.dao.SupplierDAO;
import com.niit.shoppingCartBackEnd.model.Supplier;


public class TestSupplierDAO {
	@Autowired
	static SupplierDAO supplierDAO;
	@Autowired
	static Supplier supplier;
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	public TestSupplierDAO()
	{
	context= new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingCartBackEnd");
	context.refresh();
	supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	supplier=(Supplier)context.getBean("supplier");
	
	
		
	}
	
	public void add()
	{
		supplier.setId("112");
		supplier.setName("deccan");
		supplier.setDescription("supplied by deccan ,bangalore-560001");
		supplierDAO.addSupplier(supplier);
		System.out.println("supplier added");
	}
	public static void main(String[] args)
	{
		TestSupplierDAO testSupplierDAO=new TestSupplierDAO();
		testSupplierDAO.add();
	}
}
