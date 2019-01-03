package com.mapeak.crm.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.mapeak.crm.dao.IProductDao;
import com.mapeak.crm.domain.Product;

@Repository
public class ProductDaoImpl extends HibernateDaoSupport 
	implements IProductDao, Serializable  {

	//注入 SessionFactory 为了获取 HibernateTemplate
	@Resource(name="sessionFactory")
	public void setMySessionFactory(SessionFactory factory){
		super.setSessionFactory(factory);
	}
	
	@Override
	public void save(Product product) {
		this.getHibernateTemplate().save(product);
	}

	@Override
	public List<Product> findAll() {
		return this.getHibernateTemplate().loadAll(Product.class);
	}
 
}
