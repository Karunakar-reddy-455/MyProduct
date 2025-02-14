package com.java.siva.Hospital.Entity;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Locations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long locationId;
	private String locationName;
	@Enumerated(EnumType.STRING)
	private Status status;

	private long hospitalId;

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}

	/**
	 * @param locationId
	 * @param locationName
	 * @param status
	 * @param hospitalId
	 */
	public Locations(long locationId, String locationName, Status status, long hospitalId) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.status = status;
		this.hospitalId = hospitalId;
	}

	@Override
	public String toString() {
		return "Locations [locationId=" + locationId + ", locationName=" + locationName + ", status=" + status
				+ ", hospitalId=" + hospitalId + "]";
	}

	/**
	 * 
	 */
	public Locations() {
		super();
	}

}
