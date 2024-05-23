package com.java.siva.Hospital.Entity;

import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PatientRegistation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long patientId;
	private String firstName;
	private String lastName;
	private String middleName;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String email;
	private long phone;
	private long adhar;
	private String place;
	private int stateId;
	private int countryId;
	@Enumerated(EnumType.STRING)
	private Status status;

	/**
	 * 
	 */
	public PatientRegistation() {
		super();
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param middleName
	 * @param gender
	 * @param email
	 * @param phone
	 * @param adhere
	 * @param place
	 * @param stateId
	 * @param countryId
	 * @param status
	 */
	public PatientRegistation(long patientId, String firstName, String lastName, String middleName, Gender gender,
			String email, long phone, long adhar, String place, int stateId, int countryId, Status status) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.adhar = adhar;
		this.place = place;
		this.stateId = stateId;
		this.countryId = countryId;
		this.status = status;
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PatientRegistation [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", email=" + email + ", phone=" + phone + ", adhar=" + adhar
				+ ", place=" + place + ", stateId=" + stateId + ", countryId=" + countryId + ", status=" + status + "]";
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

}
