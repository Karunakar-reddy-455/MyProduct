package com.java.siva.Hospital.exception;

import java.time.LocalDateTime;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class UserRegisterExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<UserRegisterResponse> UserRegisterhandleException(Exception ex, WebRequest request)
			throws Exception
	{
		UserRegisterResponse registerResponse = new UserRegisterResponse(LocalDateTime.now(), ex.getMessage(),
				request.getDescription(false));
		
		return new ResponseEntity<UserRegisterResponse>(registerResponse, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(IdNotFoundException.class)
	public final ResponseEntity<UserRegisterResponse> RegisterhandleException(Exception ex, WebRequest request)
			throws Exception
	{
		UserRegisterResponse registerResponse = new UserRegisterResponse(LocalDateTime.now(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<UserRegisterResponse>(registerResponse, HttpStatus.NOT_FOUND);

	}

	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request)
	{
		UserRegisterResponse registerResponse = new UserRegisterResponse(LocalDateTime.now(),
				ex.getFieldError().getDefaultMessage(), request.getDescription(false));
		return new ResponseEntity<>(registerResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(EmailAndPasswordException.class)
	public final ResponseEntity<UserRegisterResponse> EmailAndPasswordExpetion(Exception ex, WebRequest request)
			throws Exception {
		UserRegisterResponse registerResponse = new UserRegisterResponse(LocalDateTime.now(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<UserRegisterResponse>(registerResponse, HttpStatus.NOT_FOUND);

	}

}
