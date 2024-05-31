package com.java.siva.Hospital.Dto;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class StateDto {

	private long stateId;
	private String stateName;
	private long countryId;
	@Enumerated(EnumType.STRING)
	private Status status;

	public long getStateId() {
		return stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public long getCountryId() {
		return countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
