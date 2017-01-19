

package com.niit.shoppingCartBackEnd.daoImpl;
import java.util.List;

import org.hibernate.HibernateException;
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
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		return false;
	}
    @Transactional
	public boolean deleteCategory(String id) {
		try {
			String hql="DELETE FROM Category WHERE id='"+id+"'";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			query.executeUpdate();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
    @Transactional
    public Category getCategory(String id)
    {
    	String hql = "from Category where id="+"'"+id+"'";
    	Query query = sessionFactory.getCurrentSession().createQuery(hql);
    	List<Category> list = query.list();
    	return list.get(0);
    }
    @Transactional
    public Category getCategoryName(String name)
    {
    	String hql = "from Category where name="+"'"+name+"'";
    	Query query = sessionFactory.getCurrentSession().createQuery(hql);
    	List<Category> list = query.list();
    	return list.get(0);
    }

}
