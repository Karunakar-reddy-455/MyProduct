package com.java.siva.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.siva.Hospital.Entity.PatientRegistation;

@Repository
public interface PatientRepository extends JpaRepository<PatientRegistation, Long> {

}
