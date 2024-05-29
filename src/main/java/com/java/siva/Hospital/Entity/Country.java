package com.java.siva.Hospital.Entity;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	/**
	 * @param countryId
	 * @param countryName
	 * @param status
	 */
	public Country(long countryId, String countryName, Status status) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.status = status;
	}

	/**
	 * 
	 */
	public Country() {
		super();
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", status=" + status + "]";
	}

}
