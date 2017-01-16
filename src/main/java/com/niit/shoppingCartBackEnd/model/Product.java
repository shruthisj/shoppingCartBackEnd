package com.niit.shoppingCartBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Product {
	@Id
	private String id;
	private String name;
	private String  price;
	private String description;
	@ManyToOne
	@JoinColumn(name="category_id",insertable=false,updatable=false,nullable=false)
	private Category category;
	private String category_id;
	@ManyToOne
	@JoinColumn(name="supplier_id",insertable=false,updatable=false,nullable=false)
	private Supplier supplier;
	private String supplier_id;
	private String stock;
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getPrice()
	{
		return price;
	}
    
	public void setPrice(String price)
	{
		this.price=price;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
	    this.description=description;	
	}
	public String getCategoryId()
	{
		return category_id;
	}
	public void setCategoryId(String category_id)
	{
		this.category_id=category_id;
	}
	public String getSupplierId()
	{
		return supplier_id;
	}
	public void setSupplierId(String supplier_id)
	{
		this.supplier_id = supplier_id;
	}
	public String getStock()
	{
		return stock;
	}
	
	public void setStock(String stock)
	{
		this.stock=stock;
	}
	public Category getCategory()
	{
		return category;
	}
	public void setCategory(Category category)
	{
		this.category=category;
	}
	public Supplier getSupplier()
	{
		return supplier;
	}
	public void setSupplier(Supplier supplier)
	{
		this.supplier=supplier;
	}

	
}


