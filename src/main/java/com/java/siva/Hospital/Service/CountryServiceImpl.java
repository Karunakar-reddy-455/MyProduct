package com.java.siva.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Entity.Country;
import com.java.siva.Hospital.Repository.CountryRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Country saveCountry(Country country) {
		return countryRepository.save(country);
	}

	@Override
	public List<Country> fetchAll() {
		return countryRepository.findAll();
	}

	@Override
	public void deleteCountry(Long countryId) {
		if (countryRepository.findById(countryId).isPresent()) {
			countryRepository.deleteById(countryId);
		} else {
			throw new IdNotFoundException("Country Id is Not present " + " " + countryId);
		}

	}

	@Override
	public Country updateCountry(Country country, Long countryId) {
		if (countryRepository.findById(countryId).isPresent()) {
			return countryRepository.save(country);
		} else {
			throw new IdNotFoundException("Country Id is Not present " + " " + countryId);
		}

	}

	@Override
	public Country findBiCountrId(Long countryId) {
		if (countryRepository.findById(countryId).isPresent()) {
			return countryRepository.findById(countryId).get();
		} else {
			throw new IdNotFoundException("Country Id is Not present " + " " + countryId);
		}

	}
}
