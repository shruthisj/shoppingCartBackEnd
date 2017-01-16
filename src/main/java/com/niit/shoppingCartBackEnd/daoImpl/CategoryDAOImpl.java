

package com.niit.shoppingCartBackEnd.daoImpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingCartBackEnd.dao.CategoryDAO;
import com.niit.shoppingCartBackEnd.dao.UserDAO;
import com.niit.shoppingCartBackEnd.model.Category;
import com.niit.shoppingCartBackEnd.model.User;

@Repository("categoryDAO")
@EnableTransactionManagement
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;
       
    @Transactional
	public boolean addCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);
		return false;
	}
    @Transactional
	public boolean deleteCategory(String id) {
		String hql="DELETE FROM Category WHERE id='"+id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.executeUpdate();
		return true;
	}
    @Transactional
	public List<Category> list() {
		String hql="FROM Category";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

    @Transactional
	public boolean updateCategory(Category category) {
		sessionFactory.getCurrentSession().update(category);
		return true;
	}
	

}
