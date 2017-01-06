package com.niit.shoppingCartBackEnd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingCartBackEnd.dao.UserDAO;
import com.niit.shoppingCartBackEnd.model.User;

public class TestUserDAO {

	@Autowired
	static UserDAO userDAO;
	
	@Autowired
	static User user;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
public TestUserDAO()
{
	context = new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingCartBackEnd");
	context.refresh();
	userDAO = (UserDAO) context.getBean("userDAO");
	user = (User) context.getBean("user");
}
public void add()
{
	user.setEmail_id("surajsjarali@gmail.com");
	user.setF_name("sss");
	user.setL_name("jara");
	user.setAddrs("blg");
	user.setMb_no("12345678");
	user.setPassword("0001");
	userDAO.addUser(user);
	System.out.println("user added");
}
public static void main(String[] args)
{
	TestUserDAO testUserDAO=new TestUserDAO();
	testUserDAO.add();
}
}
