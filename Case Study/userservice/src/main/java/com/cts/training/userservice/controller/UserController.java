package com.cts.training.userservice.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;
import com.cts.training.userservice.entity.Users;
import com.cts.training.userservice.exception.UserErrorResponse;
import com.cts.training.userservice.exception.UserNotFoundException;
import com.cts.training.userservice.model.DataModel;
import com.cts.training.userservice.model.UserOutput;
import com.cts.training.userservice.repository.UserRepository;
import com.cts.training.userservice.service.RolesService;
import com.cts.training.userservice.service.IUserService;


@RestController
public class UserController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	private IUserService userServices;
	
	@Autowired
	private RolesService authoritiesService;
	
	@GetMapping("/users")
	public ResponseEntity<DataModel> getall(){
		DataModel data = new DataModel();
		data.setUsers(this.userServices.findAllUsers());
		ResponseEntity<DataModel> result = new ResponseEntity<DataModel>(data, HttpStatus.OK);
		return result;
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<UserOutput> getById(@PathVariable Integer userId){
		UserOutput user = new UserOutput();
		Users record = new Users();
		Optional<Users> users = this.userServices.findUserById(userId);
		if(users.isPresent())
			record = users.get();
		else {
			throw new UserNotFoundException("User not found");
		}
		user.setId(record.getId());
		user.setUsername(record.getUsername());
	user.setPassword(record.getPassword());
		user.setEmail(record.getEmail());
	//	user.setProfile(record.getProfile());
		ResponseEntity<UserOutput> result = new ResponseEntity<UserOutput>(user, HttpStatus.OK);
		return result;
	}
	
	//save new user
	@PostMapping("/users")
	public boolean save(@RequestBody UserOutput user) {
		
		// this.userServices.saveuser(user);
		return true;
		
	}
	
	//update user
	@PutMapping("/users")
	public boolean update(@RequestBody UserOutput user) {
		
		this.userServices.updateUser(user);
		return true;
		
	}
	
	@ExceptionHandler  // ~catch
	public ResponseEntity<UserErrorResponse> productOperationErrorHAndler(Exception ex) {
		// create error object
		UserErrorResponse error = new UserErrorResponse(ex.getMessage(), 
															  HttpStatus.BAD_REQUEST.value(), 
															  System.currentTimeMillis());
		ResponseEntity<UserErrorResponse> response =
										new ResponseEntity<UserErrorResponse>(error, HttpStatus.NOT_FOUND);
		logger.error("Exception :" + error);
		
		return response;
	}

	
	@ExceptionHandler  // ~catch
	public ResponseEntity<UserErrorResponse> UserOperationErrorHAndler(Exception ex) {
		// create error object
		UserErrorResponse error = new UserErrorResponse(ex.getMessage(), 
															  HttpStatus.BAD_REQUEST.value(), 
															  System.currentTimeMillis());
		ResponseEntity<UserErrorResponse> response =
										new ResponseEntity<UserErrorResponse>(error, HttpStatus.NOT_FOUND);
		logger.error("Exception :" + error);
		
		return response;
	}
	
	
	
	/************ REST endpoints ************/
	// /api/User [GET]
	// /api/User/id [GET]
	// /api/User [POST]
	// /api/User [PUT]
	// /api/User/id [DELETE]
	
	
	
	
}
	












