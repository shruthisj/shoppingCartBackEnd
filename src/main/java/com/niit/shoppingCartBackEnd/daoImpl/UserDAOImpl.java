package com.niit.shoppingCartBackEnd.daoImpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingCartBackEnd.dao.UserDAO;
import com.niit.shoppingCartBackEnd.model.User;

@Repository("userDAO")
@EnableTransactionManagement
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;
		@Transactional
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}
    @Transactional
	public User validateUser(String id, String password) {
		// TODO Auto-generated method stub
		return null;
	}
    @Transactional
	public boolean addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		return false;
	}
    @Transactional
	public boolean updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
		return false;
	}
    @Transactional
	public boolean deleteUser(String id) {
		
		return false;
	}
    @Transactional
	public List<User> list() {
		String hql="FROM Product";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	

}
