package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.CountryDto;
import com.java.siva.Hospital.Entity.Country;

public interface CountryService {

	public CountryDto saveCountry(CountryDto countryDto);

	public List<Country> fetchAll();

	public void deleteCountry(Long countryId);

	public CountryDto updateCountry(CountryDto countryDto, Long countryId);

	public CountryDto findBiCountrId(Long countryId);

}
