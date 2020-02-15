package com.cts.training.mavenweb.services;

import java.util.List;

import com.cts.training.mavenweb.entity.Users;

public interface IStudentService {

	List<Users> findAllStudents();
	Users findStudentById(Integer id);
	boolean addStudent(Users users);
	boolean updateStudent(Users users);
	boolean deleteStudent(Integer id);
}
