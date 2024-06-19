package com.java.siva.Hospital.Dto;

public class LocationDto {
	
	
	private long locationId;
	private String hospitalName;
	private String hospitalEmail;
	private long hospitalMobile;
	private String locationName;
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalEmail() {
		return hospitalEmail;
	}
	public void setHospitalEmail(String hospitalEmail) {
		this.hospitalEmail = hospitalEmail;
	}
	public long getHospitalMobile() {
		return hospitalMobile;
	}
	public void setHospitalMobile(long hospitalMobile) {
		this.hospitalMobile = hospitalMobile;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	/**
	 * @param locationId
	 * @param hospitalName
	 * @param hospitalEmail
	 * @param hospitalMobile
	 * @param locationName
	 */
	public LocationDto(long locationId, String hospitalName, String hospitalEmail, long hospitalMobile,
			String locationName) {
		super();
		this.locationId = locationId;
		this.hospitalName = hospitalName;
		this.hospitalEmail = hospitalEmail;
		this.hospitalMobile = hospitalMobile;
		this.locationName = locationName;
	}
	
	

}
