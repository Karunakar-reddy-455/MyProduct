package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.HospitalDto;
import com.java.siva.Hospital.Entity.Hospital;
import com.java.siva.Hospital.Enum.Status;

public interface HospitalService {

	public HospitalDto registerUser(HospitalDto hospitalDto, Status status);

	public List<Hospital> findAllUser();

	public String deleteUser(Long hospitalId);

	public HospitalDto updateUser(HospitalDto hospitalDto, Long hospitalId);

	public HospitalDto findById(Long hospitalId);
	
	public String findByEmailAndPassword(Hospital hospital);
}