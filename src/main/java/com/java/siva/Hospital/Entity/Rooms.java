package com.java.siva.Hospital.Entity;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rooms {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roomId;

	private String roomName;

	private Status status;
	private long hospitalId;
	private long locationId;
	private long flourId;

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

	public long getFlourId() {
		return flourId;
	}

	public void setFlourId(long flourId) {
		this.flourId = flourId;
	}

	/**
	 * @param roomId
	 * @param roomName
	 * @param status
	 * @param hospitalId
	 * @param locationId
	 * @param flourId
	 */
	public Rooms(long roomId, String roomName, Status status, long hospitalId, long locationId, long flourId) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.status = status;
		this.hospitalId = hospitalId;
		this.locationId = locationId;
		this.flourId = flourId;
	}

	/**
	 * 
	 */
	public Rooms() {
		super();
	}

	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", roomName=" + roomName + ", status=" + status + ", hospitalId="
				+ hospitalId + ", locationId=" + locationId + ", flourId=" + flourId + "]";
	}

}
