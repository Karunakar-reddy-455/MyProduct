package com.java.siva.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.siva.Hospital.Entity.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

	public Hospital findByHospitalEmailAndPassword(String hospitalEmail,String password);
}
