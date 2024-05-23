package com.java.siva.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Entity.Appointment;
import com.java.siva.Hospital.Repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public Appointment saveAppointment(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

	@Override
	public Appointment updateAppointment(Appointment appointment, Long id) {
		return appointmentRepository.save(appointment);
	}

	@Override
	public List<Appointment> fetchAllAppointments() {
		return appointmentRepository.findAll();
	}

}
