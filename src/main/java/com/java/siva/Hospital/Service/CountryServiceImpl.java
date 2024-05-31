package com.java.siva.Hospital.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.CountryDto;
import com.java.siva.Hospital.Entity.Country;
import com.java.siva.Hospital.Repository.CountryRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CountryDto saveCountry(CountryDto countryDto) {
		Country country = modelMapper.map(countryDto, Country.class);
		country = countryRepository.save(country);
		return modelMapper.map(country, CountryDto.class);
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
	public CountryDto updateCountry(CountryDto countryDto, Long countryId) {
		if (countryRepository.findById(countryId).isPresent()) {
			Country country = modelMapper.map(countryDto, Country.class);
			country = countryRepository.save(country);
			return modelMapper.map(country, CountryDto.class);
		} else {
			throw new IdNotFoundException("Country Id is Not present " + " " + countryId);
		}

	}

	@Override
	public CountryDto findBiCountrId(Long countryId) {
		Optional<Country> country = countryRepository.findById(countryId);
		if (country.isPresent()) {
			return modelMapper.map(country, CountryDto.class);

		} else {
			throw new IdNotFoundException("countryId Id is Not present " + " " + countryId);
		}

	}
}
