package com.cts.training.mavenweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.mavenweb.entity.Users;
import com.cts.training.mavenweb.exception.StudentErrorResponse;
import com.cts.training.mavenweb.exception.StudentNotFoundException;
import com.cts.training.mavenweb.services.IStudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	// dependency
	@Autowired
	private IStudentService studentService;
	
	// @RequestMapping(value =  "/students", method = {RequestMethod.GET, RequestMethod.PUT} )
	@GetMapping("/students") // GET HTTP VERB
	public ResponseEntity<List<Users>> exposeAll() {
		
		List<Users> users = this.studentService.findAllStudents();
		// if(students.size() == 0)
		if(users == null)
			throw new StudentNotFoundException("Not able to fetch records!!!");
		ResponseEntity<List<Users>> response = 
								new ResponseEntity<List<Users>>(users, HttpStatus.OK);
		
		
		return response;
	}
	
	// {<data variable>}
	@GetMapping("/students/{studentId}") // GET HTTP VERB
	public ResponseEntity<Users> getById(@PathVariable Integer studentId) {
		
		Users users = this.studentService.findStudentById(studentId);
		if(users == null)
			throw new StudentNotFoundException("Student with id-" + studentId + " not Found");
		
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(users, HttpStatus.OK);

		return response;
	}
	
	// @RequestMapping(value =  "/students", method = RequestMethod.POST)
	@PostMapping("/students") // POST HTTP VERB
	public ResponseEntity<Users> save(@RequestBody Users users) {
		if(!this.studentService.addStudent(users))
			throw new RuntimeException("Could not add new record!!!");
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(users, HttpStatus.OK);

		return response;
	}
	
	@PutMapping("/students")
	public ResponseEntity<Users> saveUpdate(@RequestBody Users users) {
		if(!this.studentService.updateStudent(users))
			throw new RuntimeException("Could not update record!!!");
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(users, HttpStatus.OK);

		return response;
	}
	
	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<Users> delete(@PathVariable Integer studentId) {
		
		Users users = this.studentService.findStudentById(studentId);
		if(users == null)
			throw new StudentNotFoundException("Student with id-" + studentId + " not Found");
		
		// send studentId to DAO via SERVICE
		this.studentService.deleteStudent(studentId);
		
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(users, HttpStatus.OK);

		return response;
	}
	
	/*
	// for exception handling
	@ExceptionHandler  // ~catch
	public ResponseEntity<StudentErrorResponse> studentNotFoundHandler(StudentNotFoundException ex) {
		// create error object
		StudentErrorResponse error = new StudentErrorResponse(ex.getMessage(), 
															  HttpStatus.NOT_FOUND.value(), 
															  System.currentTimeMillis());
		ResponseEntity<StudentErrorResponse> response =
										new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND);
		
		return response;
	}
	
	@ExceptionHandler  // ~catch
	public ResponseEntity<StudentErrorResponse> studentOperationErrorHAndler(Exception ex) {
		// create error object
		StudentErrorResponse error = new StudentErrorResponse(ex.getMessage(), 
															  HttpStatus.BAD_REQUEST.value(), 
															  System.currentTimeMillis());
		ResponseEntity<StudentErrorResponse> response =
										new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND);
		
		return response;
	}*/
	
	
	
	/************ REST endpoints ************/
	// /api/student [GET]
	// /api/student/id [GET]
	// /api/student [POST]
	// /api/student [PUT]
	// /api/student/id [DELETE]
	
	
	
	
}
