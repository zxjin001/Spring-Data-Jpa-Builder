package com.mapeak.crm.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mapeak.crm.dao.IProductDao;
import com.mapeak.crm.domain.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ProductTest {

	@Resource
	private IProductDao dao;
	
	@Test
	@Transactional    //�����Ǹ��²����������ڲ��Է����м�������ע��
	@Rollback(false)  //ȡ�����Է����У�������Զ��ع�
	public void test1(){
		
		Product product = new Product();
		product.setName("MI");
		product.setBrand("С��");
		product.setPrice(1999.00);
		product.setStore(150);
		
		dao.save(product);
	}
}
 