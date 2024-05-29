package com.java.siva.Hospital.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Dto.HospitalDto;
import com.java.siva.Hospital.Entity.Hospital;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Service.HospitalService;

@RestController
@CrossOrigin
public class HospitalRegisterController {

	@Autowired
	private HospitalService userRegisterService;

	private final Logger logger = LoggerFactory.getLogger(HospitalRegisterController.class);

	@PostMapping("/userregister")
	public ResponseEntity<Hospital> registerUser(@RequestBody Hospital userRegister, Status status) {
		logger.info("User Register Successfully");
		return new ResponseEntity<Hospital>(userRegisterService.registerUser(userRegister, status), HttpStatus.CREATED);
	}

	@GetMapping("/fetchall")
	public ResponseEntity<List<Hospital>> fetchAll() {
		logger.info("User Data came Successfully");
		return new ResponseEntity<List<Hospital>>(userRegisterService.findAllUser(), HttpStatus.FOUND);
	}

	@DeleteMapping("/delete/{hospitalId}")
	public ResponseEntity<String> deleteUser(@PathVariable Long hospitalId) {
		logger.info("User Data Deleted Successfully");
		userRegisterService.deleteUser(hospitalId);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PutMapping("/update/{hospitalId}")
	public Hospital updateUser(@RequestBody Hospital userRegister, @PathVariable Long hospitalId) {
		logger.info("User Data Updated Successfully");
		return userRegisterService.updateUser(userRegister, hospitalId);
	}

	@GetMapping("/findbyid/{hospitalId}")
	public HospitalDto findById(@PathVariable Long hospitalId) {
		logger.info("User id identify Successfully");
		return userRegisterService.findById(hospitalId);
	}

	@GetMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password) {
		return userRegisterService.login(email, password);
	}

}
