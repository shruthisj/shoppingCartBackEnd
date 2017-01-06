

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
		sessionFactory.getCurrentSession().update(category);
		return false;
	}
    @Transactional
	public boolean deleteCategory(String id) {
		
		return false;
	}
    @Transactional
	public List<Category> list() {
		String hql="FROM Catergory";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
