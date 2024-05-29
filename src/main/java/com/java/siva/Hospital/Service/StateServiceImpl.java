package com.java.siva.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Entity.State;
import com.java.siva.Hospital.Repository.StateRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;

	@Override
	public State saveState(State state) {
		return stateRepository.save(state);
	}

	@Override
	public List<State> fetchAll() {
		return stateRepository.findAll();
	}

	@Override
	public String deleteState(Long stateId) {
		if (stateRepository.findById(stateId).isPresent()) {
			stateRepository.deleteById(stateId);
			return "Deleted Successfully";
		} else {
			throw new IdNotFoundException("stateId Id is Not present " + " " + stateId);
		}

	}

	@Override
	public State updateState(State state, Long stateId) {
		if (stateRepository.findById(stateId).isPresent()) {
			return stateRepository.save(state);
		} else {
			throw new IdNotFoundException("stateId Id is Not present " + " " + stateId);
		}

	}

	@Override
	public State findByStateId(Long stateId) {
		if (stateRepository.findById(stateId).isPresent()) {
			return stateRepository.findById(stateId).get();

		} else {
			throw new IdNotFoundException("stateId Id is Not present " + " " + stateId);
		}

	}

	@Override
	public List<State> findByCountryId(Long countryId) {
		if (stateRepository.findById(countryId).isPresent()) {
			return stateRepository.findByCountryId(countryId);
		} else {
			throw new IdNotFoundException("countryId Id is Not present " + " " + countryId);
		}

	}

}
