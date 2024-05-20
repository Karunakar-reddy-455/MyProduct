package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.HospitalRegisterDto;
import com.java.siva.Hospital.Entity.HospitalRegister;
import com.java.siva.Hospital.Enum.Status;

public interface UserRegisterService {

	public HospitalRegister registerUser(HospitalRegister hospitalRegister, Status status);

	public List<HospitalRegister> findAllUser();

	public void deleteUser(Long id);

	public HospitalRegister updateUser(HospitalRegister userRegister, Long id);

	public HospitalRegisterDto findById(Long id);

}
