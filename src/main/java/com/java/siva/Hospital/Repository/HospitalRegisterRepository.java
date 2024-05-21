package com.java.siva.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.siva.Hospital.Entity.HospitalRegister;

@Repository
public interface HospitalRegisterRepository extends JpaRepository<HospitalRegister, Long> {

	public HospitalRegister findByEmailAndPassword(String email,String password);
}
