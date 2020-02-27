package com.cts.training.userservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.training.userservice.entity.Authorities;
import com.cts.training.userservice.entity.Users;
import com.cts.training.userservice.model.UserInput;
import com.cts.training.userservice.model.UserOutput;
import com.cts.training.userservice.repository.UserRepository;
import com.cts.training.userservice.repository.RolesRepository;





// @Component
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RolesRepository authorityRepository;
	
	
	
	// get all

	public List<Users> findAllUsers() {
		List<Users> records=this.userRepository.findAll();
		return  records;
	}



	@Override
	public Optional<Users> findUserById(Integer id) {
		Optional<Users> record= this.userRepository.findById(id);
		return record;
		
	}




	public void addUser(UserInput user) {
		Users data = new Users();
		//Authorities auth = new Authorities();
		//auth.setUsername(user.getUsername());
		//auth.setAuthority("ROLE_USER");
		// data.setId(user.getId());
		data.setUsername(user.getUsername());
		
		data.setEmail(user.getEmail());
		
		data.setPassword("{noop}" + user.getPassword());
	//	data.setProfile(user.getProfile());
		data.setEnabled(true);
		this.userRepository.save(data);
		
		// add authority
		Authorities roles = new Authorities(user.getUsername(), "ROLE_USER");
		this.authorityRepository.save(roles);
	}




	public void updateUser(UserOutput user) {
		Users data = new Users();
		//Authorities auth = new Authorities();
		//auth.setUsername(user.getUsername());
		//auth.setAuthority("ROLE_USER");
		data.setId(user.getId());
		data.setUsername(user.getUsername());
		
		data.setEmail(user.getEmail());
		data.setPassword(user.getPassword());
	//	data.setProfile(user.getProfile());
		data.setEnabled(true);
		this.userRepository.save(data);
	}
	}

	

	