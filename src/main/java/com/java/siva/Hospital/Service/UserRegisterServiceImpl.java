package com.java.siva.Hospital.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.HospitalRegisterDto;
import com.java.siva.Hospital.Entity.HospitalRegister;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Repository.UserRegisterRepository;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {

	@Autowired
	private UserRegisterRepository userRegisterRepository;

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

	@Override
	public HospitalRegister registerUser(HospitalRegister hospitalRegister, Status status) {

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
	public List<HospitalRegister> findAllUser() {
		return userRegisterRepository.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		userRegisterRepository.deleteById(id);
	}

	@Override
	public HospitalRegister updateUser(HospitalRegister userRegister, Long id) {
		return userRegisterRepository.save(userRegister);
	}

	@Override
	public HospitalRegisterDto findById(Long id) {
		HospitalRegister h = userRegisterRepository.findById(id).get();
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(h, HospitalRegisterDto.class);
	}

}
