package com.cts.training.casestudy.userservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.casestudy.userservice.entity.*;
import com.cts.training.casestudy.userservice.repository.*;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	private Environment env;
	// dependency
	@Autowired
	private UserRepository userRepository;
	
	// REST method that will recieve a movie Id and return details of that movie
	// ENDPOINT : /movies/{movieId}
	@GetMapping("/users/{userId}")
	public ResponseEntity<User> userDetail(@PathVariable Integer userId){
		Optional<User> record =  this.userRepository.findById(userId);
		User user = new User();
		if(record.isPresent())
			user = record.get();
		ResponseEntity<User> response = new ResponseEntity<User>(user, HttpStatus.OK);
		return response;
	}
}/*
	@PostMapping("/users")
	public ResponseEntity<User> user(@RequestMapping Integer userId){
		Optional<User> record =  this.userRepository.findById(userId);
		User user = new User();
		if(record.isPresent())
			user = record.get();
		ResponseEntity<User> response = new ResponseEntity<User>(user, HttpStatus.OK);
		return response;
	}
	

}

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.userservice.entity.User;
import com.cts.training.userservice.repository.UserRepository;

@RestController
public class UserController {

	// dependency
	@Autowired
	private UserRepository userRepository;
	
	// REST method that will recieve a movie Id and return details of that movie
	// ENDPOINT : /movies/{movieId}
	@GetMapping("/users/{userId}")
	public ResponseEntity<User> userDetail(@PathVariable Integer userId){
		Optional<User> record =  this.userRepository.findById(userId);
		User user = new User();
		if(record.isPresent())
			user = record.get();
		ResponseEntity<User> response = new ResponseEntity<User>(user, HttpStatus.OK);
		return response;
	}
}


*/











