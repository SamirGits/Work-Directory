package com.cts.training.bootapphibernate.dao;

import java.util.List;

import com.cts.training.bootapphibernate.entity.Product;

public interface IProductDao {

	List<Product> findAll();
	Product findById(Integer id);
	boolean add(Product student);
	boolean update(Product student);
	boolean delete(Integer id);
}
