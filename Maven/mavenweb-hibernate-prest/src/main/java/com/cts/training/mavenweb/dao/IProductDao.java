package com.cts.training.mavenweb.dao;

import java.util.List;

import com.cts.training.mavenweb.entity.Product;

public interface IProductDao {

	List<Product> findAll();
	Product findById(Integer id);
	boolean add(Product student);
	boolean update(Product student);
	boolean delete(Integer id);
}
