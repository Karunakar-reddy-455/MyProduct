package com.java.siva.Hospital.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Master {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long masterId;
	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
	private long aadhaar;
	private String panNumber;
	private String address;

	public long getMasterId() {
		return masterId;
	}

	public void setMasterId(long masterId) {
		this.masterId = masterId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 */
	public Master() {
		super();
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	/**
	 * @param masterId
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param mobile
	 * @param aadhaar
	 * @param panNumber
	 * @param address
	 */
	public Master(long masterId, String firstName, String lastName, String email, long mobile, long aadhaar,
			String panNumber, String address) {
		super();
		this.masterId = masterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.aadhaar = aadhaar;
		this.panNumber = panNumber;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Master [masterId=" + masterId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobile=" + mobile + ", aadhaar=" + aadhaar + ", panNumber=" + panNumber + ", address="
				+ address + "]";
	}
	

}
