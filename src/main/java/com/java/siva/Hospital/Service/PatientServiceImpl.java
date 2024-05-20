package com.java.siva.Hospital.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.PatientDto;
import com.java.siva.Hospital.Entity.PatientRegistation;
import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Repository.PatientRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public PatientDto addPatient(PatientDto patientDto, Status status, Gender gender) {
		PatientRegistation savedPatient = patientRepository.save(modelMapper.map(patientDto, PatientRegistation.class));
		if (status != null) {
			switch (status) {
			case ACTIVE:
			case BLOCKED:
			case INACTIVE:
				patientDto.setStatus(status);
				break;
			}
		}

		if (gender != null) {
			switch (gender) {
			case MALE:
			case FEMALE:
			case OTHER:
				patientDto.setGender(gender);
				break;
			}
		}
		return modelMapper.map(savedPatient, PatientDto.class);

	}

	@Override
	public List<PatientRegistation> fetchAllPatient() {
		return patientRepository.findAll();
	}

	@Override
	public void deletePatient(Long id) {
		patientRepository.deleteById(id);
	}

	@Override
	public PatientDto updatePatient(PatientDto patientDto, Long id) {
		PatientRegistation patient = patientRepository.save(modelMapper.map(patientDto, PatientRegistation.class));
		return modelMapper.map(patient, PatientDto.class);
	}

	@Override
	public PatientDto findByPatient(Long id) {
		Optional<PatientRegistation> patient = patientRepository.findById(id);
		if (patient.isPresent()) {
			// ModelMapper modelMapper = new ModelMapper();
			return modelMapper.map(patient, PatientDto.class);

		} else {
			throw new IdNotFoundException("Supplier not found with id: " + id);
		}
	}
}
