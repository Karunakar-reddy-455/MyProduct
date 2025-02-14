package com.java.siva.Hospital.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmailAndPasswordException  extends RuntimeException{
	
	public EmailAndPasswordException(String message) {
		super(message);
	}

}
