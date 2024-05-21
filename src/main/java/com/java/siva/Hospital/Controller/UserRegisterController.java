package com.java.siva.Hospital.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Dto.HospitalRegisterDto;
import com.java.siva.Hospital.Entity.HospitalRegister;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Service.UserRegisterService;

@RestController
public class UserRegisterController {

	@Autowired
	private UserRegisterService userRegisterService;

	private final Logger logger = LoggerFactory.getLogger(UserRegisterController.class);

	@PostMapping("/userregister")
	public ResponseEntity<HospitalRegister> registerUser(@RequestBody HospitalRegister userRegister, Status status) {
		logger.info("User Register Successfully");
		return new ResponseEntity<HospitalRegister>(userRegisterService.registerUser(userRegister, status),
				HttpStatus.CREATED);
	}

	@GetMapping("/fetchall")
	public ResponseEntity<List<HospitalRegister>> fetchAll() {
		logger.info("User Data came Successfully");
		return new ResponseEntity<List<HospitalRegister>>(userRegisterService.findAllUser(), HttpStatus.FOUND);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id) {
		logger.info("User Data Deleted Successfully");
		userRegisterService.deleteUser(id);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public HospitalRegister updateUser(@RequestBody HospitalRegister userRegister, @PathVariable Long id) {
		logger.info("User Data Updated Successfully");
		return userRegisterService.updateUser(userRegister, id);
	}

	@GetMapping("/findbyid/{id}")
	public HospitalRegisterDto findById(@PathVariable Long id) {
		logger.info("User id identify Successfully");
		return userRegisterService.findById(id);
	}
	
	@GetMapping("/login")
	public String loginHospital(@RequestBody HospitalRegister hospitalRegister){
		return userRegisterService.findByEmailAndPassword(hospitalRegister);
	}
}
