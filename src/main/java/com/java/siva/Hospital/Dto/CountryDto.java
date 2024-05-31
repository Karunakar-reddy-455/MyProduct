package com.java.siva.Hospital.Dto;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class CountryDto {

	private long countryId;
	private String countryName;
	@Enumerated(EnumType.STRING)
	private Status status;

	public long getCountryId() {
		return countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
