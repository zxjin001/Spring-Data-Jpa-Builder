package com.mapeak.crm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapeak.crm.domain.Product;

//JpaRepository<T, Serializable>
//T：泛型，表示实体类
//Serializable：实体类主键的类型
//删除之前定义的  save、findAll 等方法，继承的  JpaRepository 中都已经定义好
public interface IProductDao extends JpaRepository<Product, Integer> {

}
