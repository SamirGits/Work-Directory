package com.cts.training.mavenweb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {
	@ExceptionHandler  // ~catch
	public ResponseEntity<ProductErrorResponse> studentNotFoundHandler(ProductNotFoundException ex) {
		// create error object
		ProductErrorResponse error = new ProductErrorResponse(ex.getMessage(), 
															  HttpStatus.NOT_FOUND.value(), 
															  System.currentTimeMillis());
		ResponseEntity<ProductErrorResponse> response =
										new ResponseEntity<ProductErrorResponse>(error, HttpStatus.NOT_FOUND);
		
		return response;
	}
	
	@ExceptionHandler  // ~catch
	public ResponseEntity<ProductErrorResponse> studentOperationErrorHAndler(Exception ex) {
		// create error object
		ProductErrorResponse error = new ProductErrorResponse(ex.getMessage(), 
															  HttpStatus.BAD_REQUEST.value(), 
															  System.currentTimeMillis());
		ResponseEntity<ProductErrorResponse> response =
										new ResponseEntity<ProductErrorResponse>(error, HttpStatus.NOT_FOUND);
		
		return response;
	}
}
