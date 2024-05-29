package com.java.siva.Hospital.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.siva.Hospital.Entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

	public List<State> findByCountryId(Long stateId);

}
