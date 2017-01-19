package com.niit.shoppingCartBackEnd.daoImpl;

 import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.EnableTransactionManagement;
	import org.springframework.transaction.annotation.Transactional;

	import com.niit.shoppingCartBackEnd.dao.SupplierDAO;
import com.niit.shoppingCartBackEnd.model.Category;
import com.niit.shoppingCartBackEnd.model.Supplier;

	@Repository("supplierDAO")
	@EnableTransactionManagement
	public class SupplierDAOImpl implements SupplierDAO {
		@Autowired
		SessionFactory sessionFactory;
	       
	    @Transactional
		public boolean addSupplier(Supplier supplier) 
	    {
			try {
				sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			} 
			catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
	    @Transactional
		public boolean deleteSupplier(String id) {
	    	String hql="DELETE FROM Supplier WHERE id='"+id+"'";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			query.executeUpdate();
			return true;	
			
		}
	    @Transactional
		public List<Supplier> list() {
			String hql="FROM Supplier";
			Query query=sessionFactory.getCurrentSession().createQuery(hql);
			return query.list();
		}

		public boolean updateSupplier(Supplier supplier) {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		}
		
		 @Transactional
		    public Supplier getSupplier(String id)
		    {
		    	String hql = "from Supplier where id="+"'"+id+"'";
		    	Query query = sessionFactory.getCurrentSession().createQuery(hql);
		    	List<Supplier> list = query.list();
		    	return list.get(0);
		    }
		 
		 @Transactional
		 public Supplier getSupplierName(String name)
		 {
			 String hql = "from Supplier where name="+"'"+name+"'";
		    	Query query = sessionFactory.getCurrentSession().createQuery(hql);
		    	List<Supplier> list = query.list();
		    	return list.get(0);
		 }

	}



