package com.mapeak.crm.dao;

import java.util.List;

import com.mapeak.crm.domain.Product;

public interface IProductDao {

	public void save(Product product);
	
	public List<Product> findAll();
}
