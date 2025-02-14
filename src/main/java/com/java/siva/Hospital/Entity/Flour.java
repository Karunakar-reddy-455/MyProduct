package com.java.siva.Hospital.Entity;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flour {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long flourId;
	private String flourName;
	private long hospitalId;
	private long locationId;
	private Status status;

	public long getFlourId() {
		return flourId;
	}

	public void setFlourId(long flourId) {
		this.flourId = flourId;
	}

	public String getFlourName() {
		return flourName;
	}

	public void setFlourName(String flourName) {
		this.flourName = flourName;
	}

	public long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @param flourId
	 * @param flourName
	 * @param hospitalId
	 * @param locationId
	 * @param status
	 */
	public Flour(long flourId, String flourName, long hospitalId, long locationId, Status status) {
		super();
		this.flourId = flourId;
		this.flourName = flourName;
		this.hospitalId = hospitalId;
		this.locationId = locationId;
		this.status = status;
	}

	/**
	 * 
	 */
	public Flour() {
		super();
	}

	@Override
	public String toString() {
		return "Flour [flourId=" + flourId + ", flourName=" + flourName + ", hospitalId=" + hospitalId + ", locationId="
				+ locationId + ", status=" + status + "]";
	}

}
