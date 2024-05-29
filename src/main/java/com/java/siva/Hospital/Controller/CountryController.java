package com.java.siva.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Entity.Country;
import com.java.siva.Hospital.Service.CountryService;

@RestController
@CrossOrigin
public class CountryController {

	@Autowired
	private CountryService countryService;

	@PostMapping("/addcountry")
	public ResponseEntity<Country> save(@RequestBody Country country) {
		return new ResponseEntity<Country>(countryService.saveCountry(country), HttpStatus.ACCEPTED);
	}

	@GetMapping("/allcountrys")
	public ResponseEntity<List<Country>> getAll() {
		return new ResponseEntity<List<Country>>(countryService.fetchAll(), HttpStatus.OK);
	}

	@DeleteMapping("/country/{countryId}")
	public ResponseEntity<String> deleteCountry(@PathVariable Long countryId) {
		countryService.deleteCountry(countryId);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PutMapping("/updatecountry/{countryId}")
	public ResponseEntity<Country> updateCountry(@RequestBody Country country, @PathVariable Long countryId) {
		return new ResponseEntity<Country>(countryService.updateCountry(country, countryId), HttpStatus.ACCEPTED);
	}

	@GetMapping("/allcountrys/{countryId}")
	public ResponseEntity<Country> findBiCountryId(@PathVariable Long countryId) {
		return new ResponseEntity<Country>(countryService.findBiCountrId(countryId), HttpStatus.OK);
	}

}
