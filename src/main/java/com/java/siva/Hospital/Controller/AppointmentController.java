package com.java.siva.Hospital.Controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Dto.AppointmentDto;
import com.java.siva.Hospital.Entity.Appointment;
import com.java.siva.Hospital.Service.AppointmentService;

@RestController
@CrossOrigin
public class AppointmentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppointmentController.class);

	@Autowired
	private AppointmentService appointmentService;

	@PostMapping("/addappointment")
	public ResponseEntity<Appointment> addAppointment(@RequestBody Appointment appointment) {
		Appointment savedAppointment = appointmentService.saveAppointment(appointment);
		LOGGER.info("New appointment added: {}", savedAppointment);
		return new ResponseEntity<Appointment>(savedAppointment, HttpStatus.ACCEPTED);
	}

	@PutMapping("/updateAppointment/{id}")
	public ResponseEntity<Appointment> updateAppointment(@RequestBody Appointment appointment, @PathVariable Long id) {
		Appointment updatedAppointment = appointmentService.updateAppointment(appointment, id);
		LOGGER.info("Appointment updated: {}", updatedAppointment);
		return new ResponseEntity<>(updatedAppointment, HttpStatus.OK);
	}

	@GetMapping("getallAppointments")
	public ResponseEntity<List<Appointment>> getAllAppointment() {
		List<Appointment> appointments = appointmentService.fetchAllAppointments();
		LOGGER.info("Retrieved all appointments: {}", appointments);
		return new ResponseEntity<>(appointments, HttpStatus.OK);
		
		
	}

	@DeleteMapping("/appointment/{Id}")
	public ResponseEntity<String> deleteAppointment(@PathVariable Long Id) {
		LOGGER.info("Appointment Deleted }");
		 
		String ss = appointmentService.deleteAppointment(Id);
		return new ResponseEntity<>(ss, HttpStatus.OK);
	}

	@GetMapping("/hospital/{hospitalId}")
	public List<AppointmentDto> getAppointmentsByHospitalId(@PathVariable long hospitalId) {
		return appointmentService.joinTabel(hospitalId);
	}
	
	

}
