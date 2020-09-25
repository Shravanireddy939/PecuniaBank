package com.capgemini.pecunia.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler  extends ResponseEntityExceptionHandler{
	@ExceptionHandler(BankAccountNotFound.class)
	public ResponseEntity<String> myMessage(BankAccountNotFound c) {
		return new ResponseEntity<String>(c.getMessage(), HttpStatus.OK);
	}
	
	@ExceptionHandler(NullFoundException.class)
	public ResponseEntity<String> myMessage(NullFoundException c) {
		return new ResponseEntity<String>(c.getMessage(), HttpStatus.OK);
	}
}
