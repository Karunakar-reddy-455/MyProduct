package com.java.siva.Hospital.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.HospitalDto;
import com.java.siva.Hospital.Entity.Hospital;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Repository.HospitalRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository userRegisterRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public HospitalDto registerUser(HospitalDto hospitalDto, Status status) {

		if (status != null) {
			switch (status) {
			case ACTIVE:
			case BLOCKED:
			case INACTIVE:
				hospitalDto.setStatus(status);
				break;
			}
		}
		
		Hospital hospital = modelMapper.map(hospitalDto,Hospital.class);
		hospital =  userRegisterRepository.save(hospital);
		return modelMapper.map(hospital, HospitalDto.class);
		
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
	public HospitalDto updateUser(HospitalDto hospitalDto, Long hospitalId) {
		Hospital hospita = modelMapper.map(hospitalDto, Hospital.class);
		hospita = userRegisterRepository.save(hospita);
		if(userRegisterRepository.findById(hospitalId).isPresent()) {
			return modelMapper.map(hospita, HospitalDto.class);
		} 
		else {
			throw new IdNotFoundException("HospitalUpdated id not found with id: " + hospitalId);
		}
	}

	@Override
	public HospitalDto findById(Long hospitalId) {
		Optional<Hospital> h = userRegisterRepository.findById(hospitalId);

		if (h.isPresent()) {
			HospitalDto hosp = modelMapper.map(h, HospitalDto.class);
			return hosp;
		} else {
			throw new IdNotFoundException("HospitalRegister id not found with id: " + hospitalId);
		}
	}

	@Override
	public String findByEmailAndPassword(Hospital hospital) {
		Hospital dto = userRegisterRepository.findByEmailAndPassword(hospital.getEmail(),
				hospital.getPassword());

		if (dto != null && dto.getPassword().equals(hospital.getPassword()) && dto.getEmail().equals(hospital.getEmail())) {
			return "hospitalLogin details successufully";
		} else {
			return "Incorrect email and password";
		}
	}

}
