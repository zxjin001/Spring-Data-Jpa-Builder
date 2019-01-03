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
//û�м̳� HibernateDaoSupport
public class ProductDaoImpl implements IProductDao  {

	//��ȡ EntityManager
	//name�����ĸ�  EntityManagerFactory ��ȡ  EntityManager��������  EntityManager
	@PersistenceContext(name="entityManagerFactory")
	private EntityManager em;
	
	@Override
	public void save(Product product) {
		em.persist(product);
	}

	@Override
	//SQL ��ѯ���ʽ����  Hibernate ��  HQL �÷�һ��
	public List<Product> findAll() {
		return em.createQuery("FROM Product").getResultList();
	}
  
}
 