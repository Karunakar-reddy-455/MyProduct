package com.java.siva.Hospital.exception;

import java.time.LocalDateTime;

public class UserRegisterResponse {
	private LocalDateTime localDateTime;
	private String message;
	private String description;

	public UserRegisterResponse(LocalDateTime localDateTime, String message, String description) {
		super();
		this.localDateTime = localDateTime;
		this.message = message;
		this.description = description;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public String getMessage() {
		return message;
	}

	public String getDescription() {
		return description;
	}
	 
}
