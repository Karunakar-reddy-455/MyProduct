package com.java.siva.Hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Dto.LoginRequest;
import com.java.siva.Hospital.Entity.User;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/get")
	public String login(@RequestBody LoginRequest request) {
		return userService.login(request);
	}

	@PostMapping("/create")
	public User createUser(@RequestBody User user, Status status) {
		return userService.createUser(user, status);
	}

}
