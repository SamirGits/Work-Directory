package com.cts.training.casestudy.userservice.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.training.casestudy.userservice.entity.User;
import com.cts.training.casestudy.userservice.repository.UserRepository;





// @Component
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	
	
	// get all
	@Override
	public List<User> findAllUsers() {
		// add additional logic
		return this.userRepository.findAll();
	}

	
	
	/// by id
	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		// resolves problem of null reference exception
		Optional<User> record =  this.userRepository.findById(id);
		// reduces the chance of NullException
		
		// can check if object is there
		User user = new User();
		if(record.isPresent())
			user = record.get();
		return user;
		
	}
	
	
	
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		this.userRepository.save(user);
		return true;
	}
	
	
	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		this.userRepository.save(user);
		return true;
	}

	@Override
	public boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);
		return true;
	}
	
	


	
	
}
