package com.java.siva.Hospital.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.siva.Hospital.Entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	List<Patient> findByHospitalId(Long hospitalId);

}
