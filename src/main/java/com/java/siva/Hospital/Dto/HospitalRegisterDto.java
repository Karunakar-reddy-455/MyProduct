package com.java.siva.Hospital.Dto;

import com.java.siva.Hospital.Enum.Status;

public class HospitalRegisterDto {

	/*
	 * private HospitalRegister hospitalRegister;
	 * 
	 * public HospitalRegisterDto() { super(); }
	 * 
	 * public HospitalRegisterDto(HospitalRegister hospitalRegister) { super();
	 * this.hospitalRegister = hospitalRegister; }
	 * 
	 * public HospitalRegister getHospitalRegister() { return hospitalRegister; }
	 * 
	 * public void setHospitalRegister(HospitalRegister hospitalRegister) {
	 * this.hospitalRegister = hospitalRegister; }
	 */

	private long id;
	private String userName;
	private long mobile;
	private String address;
	private String email;
	private int countryId;

	/**
	 * 
	 */
	public HospitalRegisterDto() {
		super();
	}

	/**
	 * @param id
	 * @param userName
	 * @param mobile
	 * @param address
	 * @param email
	 * @param countryId
	 * @param stateId
	 * @param cityId
	 * @param area
	 * @param status
	 */
	public HospitalRegisterDto(long id, String userName, long mobile, String address, String email, int countryId,
			int stateId, int cityId, String area, Status status) {
		super();
		this.id = id;
		this.userName = userName;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
		this.countryId = countryId;
		this.stateId = stateId;
		this.cityId = cityId;
		this.area = area;
		this.status = status;
	}

	private int stateId;
	private int cityId;
	private String area;
	private Status status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}