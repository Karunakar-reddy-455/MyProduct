package com.java.siva.Hospital.Entity;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Flour {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long flourId;
	private String flourName;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "hospital_id")
	private Hospital hospital;
	
	@ManyToOne
	@JoinColumn(name = "location_id")
	private Locations location;

	/**
	 * @param flourId
	 * @param flourName
	 * @param hospital
	 * @param location
	 * @param status
	 */
	public Flour(long flourId, String flourName, Hospital hospital, Locations location, Status status) {
		super();
		this.flourId = flourId;
		this.flourName = flourName;
		this.hospital = hospital;
		this.location = location;
		this.status = status;
	}

	@Enumerated(EnumType.STRING)
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Flour() {
	}

	public Flour(long flourId, String flourName, Status status) {
		this.flourId = flourId;
		this.flourName = flourName;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Flour [flourId=" + flourId + ", flourName=" + flourName + ", hospital=" + hospital + ", location="
				+ location + ", status=" + status + "]";
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Locations getLocation() {
		return location;
	}

	public void setLocation(Locations location) {
		this.location = location;
	}
}
