package com.mapeak.crm.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.mapeak.crm.dao.IProductDao;
import com.mapeak.crm.domain.Product;

@Repository
//没有继承 HibernateDaoSupport
public class ProductDaoImpl implements IProductDao  {

	//获取 EntityManager
	//name：从哪个  EntityManagerFactory 获取  EntityManager，即创建  EntityManager
	@PersistenceContext(name="entityManagerFactory")
	private EntityManager em;
	
	@Override
	public void save(Product product) {
		em.persist(product);
	}

	@Override
	//SQL 查询表达式，和  Hibernate 的  HQL 用法一样
	public List<Product> findAll() {
		return em.createQuery("FROM Product").getResultList();
	}
  
}
 