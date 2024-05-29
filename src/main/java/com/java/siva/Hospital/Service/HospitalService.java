package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.HospitalDto;
import com.java.siva.Hospital.Entity.Hospital;
import com.java.siva.Hospital.Enum.Status;

public interface HospitalService {

	public Hospital registerUser(Hospital hospitalRegister, Status status);

	public List<Hospital> findAllUser();

	public String deleteUser(Long hospitalId);

	public Hospital updateUser(Hospital userRegister, Long hospitalId);

	public HospitalDto findById(Long hospitalId);
	
	public String login(String email, String password);
	
}