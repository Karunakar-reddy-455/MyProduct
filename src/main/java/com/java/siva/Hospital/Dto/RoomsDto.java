package com.java.siva.Hospital.Dto;

public class RoomsDto {

	private Long roomId;
	private String roomName;
	private Long hospitalId;
	private String hospitalName;
	private String locationName;
	private String flourName;

	public RoomsDto(Long roomId, String roomName, Long hospitalId, String hospitalName, String locationName,
			String flourName) {
		this.roomId = roomId;
		this.roomName = roomName;
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.locationName = locationName;
		this.flourName = flourName;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getFlourName() {
		return flourName;
	}

	public void setFlourName(String flourName) {
		this.flourName = flourName;
	}

	@Override
	public String toString() {
		return "RoomsDto{" + "roomId=" + roomId + ", roomName='" + roomName + '\'' + ", hospitalId=" + hospitalId
				+ ", hospitalName='" + hospitalName + '\'' + ", locationName='" + locationName + '\'' + ", flourName='"
				+ flourName + '\'' + '}';
	}
}
