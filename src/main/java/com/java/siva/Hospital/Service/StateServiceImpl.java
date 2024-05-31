package com.java.siva.Hospital.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.StateDto;
import com.java.siva.Hospital.Entity.State;
import com.java.siva.Hospital.Repository.StateRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public StateDto saveState(StateDto stateDto) {
		State state = modelMapper.map(stateDto,State.class);
		state = stateRepository.save(state);
		return  modelMapper.map(state,StateDto.class);
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
	public StateDto updateState(StateDto stateDto, Long stateId) {
		if (stateRepository.findById(stateId).isPresent()) {
			State state = modelMapper.map(stateDto,State.class);
			state = stateRepository.save(state);
			return modelMapper.map(state,StateDto.class);
		} else {
			throw new IdNotFoundException("stateId Id is Not present " + " " + stateId);
		}

	}

	@Override
	public StateDto findByStateId(Long stateId) {
		Optional<State> state = stateRepository.findById(stateId);
		if (state.isPresent()) {
			return modelMapper.map(state, StateDto.class);

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
