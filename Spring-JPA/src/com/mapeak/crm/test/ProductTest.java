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
	@Transactional    //现在是更新操作，必须在测试方法中加入事务注解
	@Rollback(false)  //取消测试方法中，事务的自动回滚
	public void test1(){
		
		Product product = new Product();
		product.setName("MI");
		product.setBrand("小米");
		product.setPrice(1999.00);
		product.setStore(150);
		
		dao.save(product);
	}
}
 