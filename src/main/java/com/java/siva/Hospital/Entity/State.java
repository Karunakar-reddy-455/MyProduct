package com.java.siva.Hospital.Entity;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	/**
	 * 
	 */
	public State() {
		super();
	}

	/**
	 * @param stateId
	 * @param stateName
	 * @param countryId
	 * @param status
	 */
	public State(long stateId, String stateName, long countryId, Status status) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.countryId = countryId;
		this.status = status;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", countryId=" + countryId + ", status="
				+ status + "]";
	}

}
