package com.java.siva.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.siva.Hospital.Entity.Admin;

public interface UserRepository extends JpaRepository<Admin, Long> {
	Admin findByUsernameAndPassword(String username, String password);
}
