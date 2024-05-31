package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.StateDto;
import com.java.siva.Hospital.Entity.State;

public interface StateService {

	public StateDto saveState(StateDto stateDto);

	public List<State> fetchAll();

	public String deleteState(Long stateId);

	public StateDto updateState(StateDto stateDto, Long stateId);

	public StateDto findByStateId(Long stateId);

	public List<State> findByCountryId(Long countryId);

}
