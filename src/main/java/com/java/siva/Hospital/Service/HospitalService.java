package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.HospitalRegisterDto;
import com.java.siva.Hospital.Entity.Hospital;
import com.java.siva.Hospital.Enum.Status;

public interface HospitalService {

	public Hospital registerUser(Hospital hospitalRegister, Status status);

	public List<Hospital> findAllUser();

	public String deleteUser(Long hospitalId);

	public Hospital updateUser(Hospital userRegister, Long hospitalId);

	public HospitalRegisterDto findById(Long hospitalId);
	
	public String findByEmailAndPassword(Hospital hospitalRegister);
}
