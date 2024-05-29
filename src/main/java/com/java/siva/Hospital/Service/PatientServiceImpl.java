package com.java.siva.Hospital.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.PatientDto;
import com.java.siva.Hospital.Entity.Patient;
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
	public Patient addPatient(Patient patientDto, Status status, Gender gender) {
		Patient savedPatient = patientRepository.save(modelMapper.map(patientDto, Patient.class));
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
		return modelMapper.map(savedPatient, Patient.class);

	}

	@Override
	public List<Patient> fetchAllPatient() {
		return patientRepository.findAll();
	}

	@Override
	public void deletePatient(Long id) {
		if (patientRepository.findById(id).isPresent()) {

			patientRepository.deleteById(id);
		} else {
			throw new IdNotFoundException("PatientId " + " " + id + " " + "is not present");
		}
	}

	@Override
	public Patient updatePatient(Patient patient, Long id) {
		if (patientRepository.findById(id).isPresent()) {
			return patientRepository.save(patient);
		} else {
			throw new IdNotFoundException("Patient Id is not present " + " " + id);
		}

	}

	@Override
	public PatientDto findByPatient(Long id) {
		Optional<Patient> patient = patientRepository.findById(id);
		if (patient.isPresent()) {
			return modelMapper.map(patient, PatientDto.class);

		} else {
			throw new IdNotFoundException("Patient Id not found with id: " + id);
		}
	}

	@Override
	public List<Patient> findPatientByHospitalId(Long hospitalId) {
		return patientRepository.findByHospitalId(hospitalId);
	}
}
