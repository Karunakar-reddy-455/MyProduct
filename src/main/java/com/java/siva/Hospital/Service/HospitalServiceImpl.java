package com.java.siva.Hospital.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.HospitalRegisterDto;
import com.java.siva.Hospital.Entity.Hospital;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Repository.HospitalRegisterRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class HospitalServiceImpl implements HospitalService {

	private static final String Email = null;
	@Autowired
	private HospitalRegisterRepository userRegisterRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public Hospital registerUser(Hospital hospitalRegister, Status status) {

		if (status != null) {
			switch (status) {
			case ACTIVE:
			case BLOCKED:
			case INACTIVE:
				hospitalRegister.setStatus(status);
				break;
			}
		}
		return userRegisterRepository.save(hospitalRegister);
	}

	@Override
	public List<Hospital> findAllUser() {
		return userRegisterRepository.findAll();
	}

	@Override
	public String deleteUser(Long hospitalId) {
		Optional<Hospital> k = userRegisterRepository.findById(hospitalId);
		if (k.isPresent()) {
			userRegisterRepository.deleteById(hospitalId);
			return ("Id is deleted Successfully" + hospitalId);
		} else {
			throw new IdNotFoundException("Id is not found " + hospitalId);
		}

	}

	@Override
	public Hospital updateUser(Hospital userRegister, Long hospitalId) {
		Optional<Hospital> hospitalRegisterOptional = userRegisterRepository.findById(hospitalId);
		if (hospitalRegisterOptional.isPresent()) {
			Hospital hospital = hospitalRegisterOptional.get();
			hospital.setAddress(userRegister.getAddress());
			hospital.setArea(userRegister.getArea());
			hospital.setCityId(userRegister.getCityId());
			hospital.setCountryId(userRegister.getCountryId());
			hospital.setEmail(userRegister.getEmail());
			hospital.setHospitalId(userRegister.getHospitalId());
			hospital.setMobile(userRegister.getMobile());
			hospital.setPassword(userRegister.getPassword());
			hospital.setStateId(userRegister.getStateId());
			hospital.setStatus(userRegister.getStatus());
			hospital.setUserName(userRegister.getUserName());

			return userRegisterRepository.save(hospital);
		} else {
			throw new IdNotFoundException("HospitalRegister id not found with id: " + hospitalId);
		}
	}

	@Override
	public HospitalRegisterDto findById(Long hospitalId) {
		Optional<Hospital> h = userRegisterRepository.findById(hospitalId);

		if (h.isPresent()) {
			HospitalRegisterDto hosp = modelMapper.map(h, HospitalRegisterDto.class);
			return hosp;
		} else {
			throw new IdNotFoundException("HospitalRegister id not found with id: " + hospitalId);
		}
	}
	@Override
	public String findByEmailAndPassword(Hospital hospitalRegister) {
		Hospital dto = userRegisterRepository.findByEmailAndPassword(hospitalRegister.getEmail(),
				hospitalRegister.getPassword());

		if (dto != null && dto.getPassword().equals(hospitalRegister.getPassword())&& dto.getEmail().equals(hospitalRegister.getEmail())) {
			return "hospitalLoginDto details successufully";
		} else {
			return "Incorrect email and password";
		}
	}

}
