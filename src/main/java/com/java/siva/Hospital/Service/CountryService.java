package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Entity.Country;

public interface CountryService {

	public Country saveCountry(Country country);

	public List<Country> fetchAll();

	public void deleteCountry(Long countryId);

	public Country updateCountry(Country country, Long countryId);

	public Country findBiCountrId(Long countryId);

}
