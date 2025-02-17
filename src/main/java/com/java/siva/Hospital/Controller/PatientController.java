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

import com.java.siva.Hospital.Dto.PatientDto;
import com.java.siva.Hospital.Entity.Patient;
import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Service.PatientService;

@RestController
@CrossOrigin
public class PatientController {
	@Autowired
	private PatientService patientService;

	@PostMapping("/addpatient")
	public ResponseEntity<PatientDto> createPatient(@RequestBody PatientDto patientDto, Status status, Gender gender) {
		return new ResponseEntity<PatientDto>(patientService.addPatient(patientDto, status, gender),
				HttpStatus.ACCEPTED);
	}

	@GetMapping("/AllPatientDetails")
	public ResponseEntity<List<Patient>> fetchAll() {
		return new ResponseEntity<List<Patient>>(patientService.fetchAllPatient(), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("deletePatient/{id}")
	public String deletePatient(@PathVariable Long id) {
		patientService.deletePatient(id);
		return "Deleted Successfully";
	}

	@GetMapping("/findPatient/{id}")
	public ResponseEntity<PatientDto> findByPatient(@PathVariable Long id) {
		return new ResponseEntity<PatientDto>(patientService.findByPatient(id), HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/updatePatient/{id}")
	public ResponseEntity<PatientDto>updatePatient(@RequestBody PatientDto patientDto,@PathVariable Long id){
		return new ResponseEntity<PatientDto>(patientService.updatePatient(patientDto, id), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findPatientusingHospitalId/{hospitalId}")
	public List<Patient> fetchByPatientUsingHospitalId(@PathVariable Long hospitalId){
		return patientService.findPatientByHospitalId(hospitalId);
	}
	

}
