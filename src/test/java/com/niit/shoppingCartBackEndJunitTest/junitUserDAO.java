package com.niit.shoppingCartBackEndJunitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingCartBackEnd.dao.UserDAO;
import com.niit.shoppingCartBackEnd.model.User;

public class junitUserDAO {

	@Autowired
	static UserDAO userDAO;
	
	@Autowired
	static User user;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingCartBackEnd");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
		
	}
@Test
public void add()
{
	user.setEmail_id("shruthisjarali@gmail.com");
	user.setF_name("ssj");
	user.setL_name("jar");
	user.setAddrs("blg");
	user.setMb_no("1234567890");
	user.setPassword("0000");
	userDAO.addUser(user);
	System.out.println("user added");
}
}
