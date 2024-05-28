package com.java.siva.Hospital.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Entity.Appointment;
import com.java.siva.Hospital.Repository.AppointmentRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

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
		if (appointmentRepository.findById(id).isPresent()) {
			return appointmentRepository.save(appointment);
		} else {
			throw new IdNotFoundException("Appointment  Id is not present in Tabel" + " " + id);
		}
	}

	@Override
	public List<Appointment> fetchAllAppointments() {
		return appointmentRepository.findAll();
	}
	@Override
	public String deleteAppointment(Long id) {
		if(appointmentRepository.findById(id).isPresent())
		{
			appointmentRepository.deleteById(id);
			return "Appointement Deleted Successfully";
		}
		else {
			throw new IdNotFoundException("Appointment Id is not Present" + " " + id);
		}
	}

	}

