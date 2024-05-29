package com.java.siva.Hospital.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.siva.Hospital.Entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	List<Doctor> findByHospitalId(Long hospitalId);

}
