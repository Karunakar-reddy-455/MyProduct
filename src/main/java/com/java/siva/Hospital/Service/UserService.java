package com.java.siva.Hospital.Service;

import com.java.siva.Hospital.Dto.LoginRequest;
import com.java.siva.Hospital.Entity.User;
import com.java.siva.Hospital.Enum.Status;

public interface UserService {
	String login(LoginRequest request);

	public User createUser(User user, Status status);

}
