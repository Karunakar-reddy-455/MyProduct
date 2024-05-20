package com.java.siva.Hospital.Dto;

import com.java.siva.Hospital.Enum.Status;

public class LoginRequest {
	private String username;
	private String password;
	private Status status;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoginRequest [username=" + username + ", password=" + password + ", status=" + status + "]";
	}
}
