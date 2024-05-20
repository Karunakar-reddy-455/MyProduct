package com.java.siva.Hospital.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.LoginRequest;
import com.java.siva.Hospital.Entity.User;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String login(LoginRequest request) {
		User user = userRepository.findByUsernameAndPassword(request.getUsername(), request.getPassword());

		if (user != null) {

			return "{Status:200}";
		} else {
			return "{Status:404}";
		}

	}

	@Override
	public User createUser(User user, Status status) {
		if (status != null) {
			switch (status) {
			case ACTIVE:
			case INACTIVE:
			case BLOCKED:
				user.setStatus(status);
				break;
			}
		}

		return userRepository.save(user);

	}
}
