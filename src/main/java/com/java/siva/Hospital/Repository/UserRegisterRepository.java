package com.java.siva.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.siva.Hospital.Entity.HospitalRegister;

public interface UserRegisterRepository extends JpaRepository<HospitalRegister, Long> {

}
