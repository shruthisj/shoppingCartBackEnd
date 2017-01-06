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
import com.niit.shoppingCartBackEnd.dao.SupplierDAO;
import com.niit.shoppingCartBackEnd.dao.UserDAO;
	import com.niit.shoppingCartBackEnd.model.Category;
import com.niit.shoppingCartBackEnd.model.Supplier;
import com.niit.shoppingCartBackEnd.model.User;

	@Repository("supplierDAO")
	@EnableTransactionManagement
	public class SupplierDAOImpl implements SupplierDAO {
		@Autowired
		SessionFactory sessionFactory;
	       
	    @Transactional
		public boolean addSupplier(Supplier supplier) 
	    {
			try {
				sessionFactory.getCurrentSession().save(supplier);
			} 
			catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
	    @Transactional
		public boolean deleteSupplier(String id) {
			
			return false;
		}
	    @Transactional
		public List<Supplier> list() {
			String hql="FROM Supplier";
			Query query=sessionFactory.getCurrentSession().createQuery(hql);
			return query.list();
		}

		public boolean updateSupplier1(Supplier supplier) {
			// TODO Auto-generated method stub
			return (Boolean) null;
		}
		
		public boolean updateSupplier(Supplier supplier) {
			// TODO Auto-generated method stub
			return false;
		}
		

	}



