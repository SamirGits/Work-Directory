package com.cts.training.mavenweb.dao;

import java.util.List;

import com.cts.training.mavenweb.entity.Users;

public interface IStudentDao {

	List<Users> findAll();
	Users findById(Integer id);
	boolean add(Users users);
	boolean update(Users users);
	boolean delete(Integer id);
}
