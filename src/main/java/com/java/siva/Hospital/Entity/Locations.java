package com.java.siva.Hospital.Entity;

import com.java.siva.Hospital.Enum.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Locations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long locationId;
	private String locationName;
	@Enumerated(EnumType.STRING)
	private Status status;

	@ManyToOne
	@JoinColumn(name = "hospital_id")
	private Hospital hospital;

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
	

	/**
	 * @param locationId
	 * @param locationName
	 * @param status
	 * @param hospital
	 */
	public Locations(long locationId, String locationName, Status status, Hospital hospital) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.status = status;
		this.hospital = hospital;
	}

	public Locations() {
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Locations [locationId=" + locationId + ", locationName=" + locationName + ", status=" + status
				+ ", hospital=" + hospital + "]";
	}

	

}
