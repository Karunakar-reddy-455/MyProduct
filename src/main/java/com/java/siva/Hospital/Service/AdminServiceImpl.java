package com.java.siva.Hospital.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.LoginRequest;
import com.java.siva.Hospital.Entity.Admin;
import com.java.siva.Hospital.Repository.UserRepository;
import com.java.siva.Hospital.exception.EmailAndPasswordException;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String login(LoginRequest request) {
		Admin user = userRepository.findByUsernameAndPassword(request.getUsername(), request.getPassword());

		if (user != null) {

			return "{Status:200}" + " " + "Please Login";
		}
		
	else {
			throw new EmailAndPasswordException("Email and Password Details Wrong Please check " + " " + user );
		}

	}

}
