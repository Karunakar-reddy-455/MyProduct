package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.DoctorDto;
import com.java.siva.Hospital.Entity.Doctor;
import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;

public interface DoctorService {

	public DoctorDto addDoctor(DoctorDto doctorDto, Status status, Gender gender);

	public List<Doctor> fetchAll();

	public void deleteDoctor(Long id);

	public DoctorDto updateDoctor(DoctorDto doctorDto, Long id);

	public DoctorDto findByDoctor(Long id);
	
	public List<Doctor> findDoctorsByHospitalId(Long hospitalId);

}
