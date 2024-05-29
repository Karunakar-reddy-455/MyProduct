package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Entity.State;

public interface StateService {

	public State saveState(State state);

	public List<State> fetchAll();

	public String deleteState(Long stateId);

	public State updateState(State state, Long stateId);

	public State findByStateId(Long stateId);

	public List<State> findByCountryId(Long countryId);

}
