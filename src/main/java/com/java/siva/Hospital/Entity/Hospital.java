package com.java.siva.Hospital.Entity;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long hospitalId;
	private String userName;
	private long mobile;
	private String address;
	private String email;
	private int countryId;
	private int stateId;
	private int cityId;
	private String area;
	private String password;
	@Enumerated(EnumType.STRING)
	private Status status;

	public long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @param hospitalId
	 * @param userName
	 * @param mobile
	 * @param address
	 * @param email
	 * @param countryId
	 * @param stateId
	 * @param cityId
	 * @param area
	 * @param password
	 * @param status
	 */
	public Hospital(long hospitalId, String userName, long mobile, String address, String email, int countryId,
			int stateId, int cityId, String area, String password, Status status) {
		super();
		this.hospitalId = hospitalId;
		this.userName = userName;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
		this.countryId = countryId;
		this.stateId = stateId;
		this.cityId = cityId;
		this.area = area;
		this.password = password;
		this.status = status;
	}

	/**
	 * 
	 */
	public Hospital() {
		super();
	}

	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", userName=" + userName + ", mobile=" + mobile + ", address="
				+ address + ", email=" + email + ", countryId=" + countryId + ", stateId=" + stateId + ", cityId="
				+ cityId + ", area=" + area + ", password=" + password + ", status=" + status + "]";
	}

}