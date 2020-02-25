package com.cts.training.casestudy.userservice.service;


import java.util.List;

import com.cts.training.casestudy.userservice.entity.User;






public interface IUserService {

	List<User> findAllUsers();
	User findUserById(Integer id);
	boolean addUser(User User);
	boolean updateUser(User User);
	boolean deleteUser(Integer id);
}
