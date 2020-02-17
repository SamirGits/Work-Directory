package com.cts.training.boottest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Testcontroller {

	@GetMapping("/test")
	public ResponseEntity<String> test()
	{
		ResponseEntity<String> response=new ResponseEntity<String>("This is a test only",HttpStatus.OK);
		return response;
	}
}
