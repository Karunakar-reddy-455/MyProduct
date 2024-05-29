package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.PatientDto;
import com.java.siva.Hospital.Entity.Patient;
import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;

public interface PatientService {

	public Patient addPatient(Patient patient, Status status, Gender gender);

	public List<Patient> fetchAllPatient();

	public void deletePatient(Long id);

	public Patient updatePatient(Patient patientDto, Long id);

	public PatientDto findByPatient(Long id);
	
	public List<Patient> findPatientByHospitalId(Long hospitalId);

}
