package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.PatientDto;
import com.java.siva.Hospital.Entity.PatientRegistation;
import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;

public interface PatientService {

	public PatientDto addPatient(PatientDto patient, Status status, Gender gender);

	public List<PatientRegistation> fetchAllPatient();

	public void deletePatient(Long id);

	public PatientDto updatePatient(PatientDto patientDto, Long id);

	public PatientDto findByPatient(Long id);

}
