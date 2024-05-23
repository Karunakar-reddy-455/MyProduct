package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.PatientDto;
import com.java.siva.Hospital.Entity.PatientRegistation;
import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;

public interface PatientService {

	public PatientRegistation addPatient(PatientRegistation patient, Status status, Gender gender);

	public List<PatientRegistation> fetchAllPatient();

	public void deletePatient(Long id);

	public PatientRegistation updatePatient(PatientRegistation patientDto, Long id);

	public PatientDto findByPatient(Long id);

}
