package com.teamsankya.naturebandhuproject.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teamsankya.naturebandhuproject.dto.ProductCategoryBean;
import com.teamsankya.naturebandhuproject.dto.ProductDetailsBean;

@Repository
public class NatureBandhuDaoHibernateImpl implements NatureBandhuDao {
	
	/**
	 * Default Constructor
	 */
		public NatureBandhuDaoHibernateImpl() {	}
		
	/**
	 * SessionFactory is usually created during application start up and kept for
	 * later use.
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<ProductDetailsBean> getProduct(String productName) {
		System.out.println("inside NatureBandhuDaoHibernateImpl class :)");
		System.out.println("inside getProduct daoimpl method");
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(ProductDetailsBean.class);
		criteria.add(Restrictions.like("productName", "%PEN"));
		
		List<ProductDetailsBean> result=criteria.list();
		

		transaction.commit();
		
		return result;
	}

	

}
