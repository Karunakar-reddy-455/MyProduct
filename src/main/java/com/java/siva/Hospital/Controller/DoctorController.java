package com.java.siva.Hospital.Controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Dto.DoctorDto;
import com.java.siva.Hospital.Entity.Doctor;
import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Service.DoctorService;

@RestController
@CrossOrigin
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	@PostMapping("/addDoctor")
	public ResponseEntity<DoctorDto> saveDoctor(@RequestBody DoctorDto doctorDto, Status status, Gender gender) {
		return new ResponseEntity<DoctorDto>(doctorService.addDoctor(doctorDto, status, gender), HttpStatus.ACCEPTED);
	}

	@GetMapping("/fetchAllDoctor")
	public ResponseEntity<List<Doctor>> fetchAll() {
		return new ResponseEntity<List<Doctor>>(doctorService.fetchAll(), HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteDoctor/{id}")
	public void deleteDoctor(@PathVariable Long id) {
		doctorService.deleteDoctor(id);

	}

	@PutMapping("/updateDoctor/{id}")
	public ResponseEntity<DoctorDto> updateDoctor(@RequestBody DoctorDto doctorDto, @PathVariable Long id) {
		return new ResponseEntity<DoctorDto>(doctorService.updateDoctor(doctorDto, id), HttpStatus.OK);
	}

	@GetMapping("/findByDoctor/{id}")
	public ResponseEntity<DoctorDto> findByDoctor(@PathVariable Long id) {
		return new ResponseEntity<DoctorDto>(doctorService.findByDoctor(id), HttpStatus.ACCEPTED);
	}

	@GetMapping("/findByHospital/{hospitalId}")
	public ResponseEntity<List<Doctor>> findByHospitalId(@PathVariable Long hospitalId) {
		return new ResponseEntity<List<Doctor>>(doctorService.findDoctorsByHospitalId(hospitalId), HttpStatus.ACCEPTED);
	}

}
