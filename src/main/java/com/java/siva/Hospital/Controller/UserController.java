package com.java.siva.Hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Dto.LoginRequest;
import com.java.siva.Hospital.Service.AdminService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private AdminService userService;

	@GetMapping("/get")
	public ResponseEntity<String> login(@RequestBody LoginRequest request) {
		return new ResponseEntity<String>(userService.login(request), HttpStatus.FOUND);
	}

}
