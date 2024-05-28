package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Entity.Appointment;

public interface AppointmentService {

	public Appointment saveAppointment(Appointment appointment);

	public Appointment updateAppointment(Appointment appointment, Long id);

	public List<Appointment> fetchAllAppointments();
	
	public String deleteAppointment(Long id);

}