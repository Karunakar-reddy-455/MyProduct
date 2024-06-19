package com.java.siva.Hospital.Entity;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Rooms {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roomId;

	private String roomName;

	private Status status;
	@ManyToOne
	@JoinColumn(name = "hospital_id")
	private Hospital hospital;
	@ManyToOne
	@JoinColumn(name = "location_id")
	private Locations location;
	@ManyToOne
	@JoinColumn(name = "flour_id")
	private Flour flour;

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Flour getFlour() {
		return flour;
	}

	public void setFlour(Flour flour) {
		this.flour = flour;
	}

	public Locations getLocation() {
		return location;
	}

	public void setLocation(Locations location) {
		this.location = location;
	}

	/**
	 * @param roomId
	 * @param roomName
	 * @param status
	 * @param hospital
	 * @param location
	 * @param flour
	 */
	public Rooms(long roomId, String roomName, Status status, Hospital hospital, Locations location, Flour flour) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.status = status;
		this.hospital = hospital;
		this.location = location;
		this.flour = flour;
	}

	/**
	 * 
	 */
	public Rooms() {
		super();
	}

	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", roomName=" + roomName + ", status=" + status + ", hospital=" + hospital
				+ ", location=" + location + ", flour=" + flour + "]";
	}

}
