package com.java.siva.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.siva.Hospital.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsernameAndPassword(String username, String password);
}
