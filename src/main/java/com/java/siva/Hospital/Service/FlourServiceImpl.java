package com.java.siva.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.FlourDto;
import com.java.siva.Hospital.Entity.Flour;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Repository.FlourRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class FlourServiceImpl implements FlourService {
	@Autowired
	private FlourRepository flourRepository;

	@Override
	public Flour addFlour(Flour flour, Status status) {
		if (status != null) {
			switch (status) {

			case ACTIVE:
			case INACTIVE:
			case BLOCKED:
				flour.setStatus(status);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + status);
			}
		}
		return flourRepository.save(flour);
	}

	@Override
	public List<Flour> fetchFLour() {
		return flourRepository.findAll();
	}

	@Override
	public String deleteFlour(Long flourId) {
		if (flourRepository.findById(flourId).isPresent()) {
			flourRepository.deleteById(flourId);
			return "Flour deleted";
		} else {
			throw new IdNotFoundException("Flour id is not present" + flourId);
		}
	}

	@Override
	public Flour updateFlour(Flour flour, Long flourId) {
		if (flourRepository.findById(flourId).isPresent()) {
			return flourRepository.save(flour);
		} else {
			throw new IdNotFoundException("Flour id is not present" + flourId);
		}
	}

	@Override
	public List<FlourDto> getHospitalId(Long hospitalId) {
		return flourRepository.findFloursByHospitalId(hospitalId);
	}

	@Override
	public Flour findByFlourId(Long flourId) {

		if (flourRepository.findById(flourId).isPresent()) {
			return flourRepository.findById(flourId).get();
		} else {
			throw new IdNotFoundException("HospitalUpdated id not found with id: " + flourId);
		}
	}

}
