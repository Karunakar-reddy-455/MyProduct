package com.java.siva.Hospital.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.DoctorDto;
import com.java.siva.Hospital.Entity.Doctor;
import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Repository.DoctorRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public DoctorDto addDoctor(DoctorDto doctordto, Status status, Gender gender) {

		if (status != null) {
			switch (status) {
			case ACTIVE:
			case INACTIVE:
			case BLOCKED:
				doctordto.setStatus(status);
				break;
			}
		}

		if (gender != null) {
			switch (gender) {
			case MALE:
			case FEMALE:
			case OTHER:
				doctordto.setGender(gender);
				break;
			}
		}
		Doctor doctor = modelMapper.map(doctordto, Doctor.class);
		doctor = doctorRepository.save(doctor);
		return modelMapper.map(doctor, DoctorDto.class);
	}

	@Override
	public List<Doctor> fetchAll() {
		return doctorRepository.findAll();
	}

	@Override
	public void deleteDoctor(Long id) {
		if (doctorRepository.findById(id).isPresent()) {
			doctorRepository.deleteById(id);
		} else {
			throw new IdNotFoundException("Doctor Id is not present in Tabel" + " " + id);
		}
	}

	@Override
	public DoctorDto updateDoctor(DoctorDto doctorDto, Long id) {
		if (doctorRepository.findById(id).isPresent()) {
			Doctor doctor =  modelMapper.map(doctorDto, Doctor.class);
			doctor =doctorRepository.save(doctor);
			return modelMapper.map(doctor, DoctorDto.class);
		} else {
			throw new IdNotFoundException("Doctor Id is not present in Tabel" + " " + id);
		}
	}

	@Override
	public DoctorDto findByDoctor(Long id) {
		Optional<Doctor> doctor = doctorRepository.findById(id);
		if (doctor.isPresent()) {
			return modelMapper.map(doctor, DoctorDto.class);
		} else {
			throw new IdNotFoundException("Doctor not found with id: " + id);
		}
	}

	@Override
	public List<Doctor> findDoctorsByHospitalId(Long hospitalId) {
		return doctorRepository.findByHospitalId(hospitalId);
	}

}
