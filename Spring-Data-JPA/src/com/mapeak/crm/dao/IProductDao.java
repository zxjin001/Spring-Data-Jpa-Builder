package com.mapeak.crm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapeak.crm.domain.Product;

//JpaRepository<T, Serializable>
//T�����ͣ���ʾʵ����
//Serializable��ʵ��������������
//ɾ��֮ǰ�����  save��findAll �ȷ������̳е�  JpaRepository �ж��Ѿ������
public interface IProductDao extends JpaRepository<Product, Integer> {

}
