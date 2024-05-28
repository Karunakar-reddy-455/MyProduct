package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.DoctorDto;
import com.java.siva.Hospital.Entity.Doctor;
import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;

public interface DoctorService {

	public Doctor addDoctor(Doctor doctor, Status status, Gender gender);

	public List<Doctor> fetchAll();

	public void deleteDoctor(Long id);

	public Doctor updateDoctor(Doctor doctor, Long id);

	public DoctorDto findByDoctor(Long id);

}
