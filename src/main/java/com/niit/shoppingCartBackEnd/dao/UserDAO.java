package com.niit.shoppingCartBackEnd.dao;

import java.util.List;

import com.niit.shoppingCartBackEnd.model.User;


public interface UserDAO {
	public List<User> list();
	//getting list of all users
	public User getUser(String id);
	//to get details of user based on id
	public User validateUser(String id,String password);
	//if it is true,value will be returned to user...else it will return null
	public boolean addUser(User user);
	//to add user
	public boolean updateUser(User user);
	//to update the user
	
	

}
