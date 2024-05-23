package com.java.siva.Hospital.Entity;

import java.sql.Date;

import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long doctorId;
	private String doctorName;
	private Date dateOfBirth;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private long phoneNumber;
	private String email;
	private String address;
	private int medicalLicenseNumber;
	private String specialization;
	private String languageSpoke;
	@Enumerated(EnumType.STRING)
	private Status status;

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMedicalLicenseNumber() {
		return medicalLicenseNumber;
	}

	public void setMedicalLicenseNumber(int medicalLicenseNumber) {
		this.medicalLicenseNumber = medicalLicenseNumber;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getLanguageSpoke() {
		return languageSpoke;
	}

	public void setLanguageSpoke(String languageSpoke) {
		this.languageSpoke = languageSpoke;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @param id
	 * @param doctorName
	 * @param dateOfBirth
	 * @param gender
	 * @param phoneNumber
	 * @param email
	 * @param address
	 * @param medicalLicenseNumber
	 * @param specialization
	 * @param languageSpoke
	 * @param status
	 */
	public Doctor(long doctorId, String doctorName, Date dateOfBirth, Gender gender, long phoneNumber, String email,
			String address, int medicalLicenseNumber, String specialization, String languageSpoke, Status status) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.medicalLicenseNumber = medicalLicenseNumber;
		this.specialization = specialization;
		this.languageSpoke = languageSpoke;
		this.status = status;
	}

	/**
	 * 
	 */
	public Doctor() {
		super();
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", medicalLicenseNumber=" + medicalLicenseNumber + ", specialization=" + specialization
				+ ", languageSpoke=" + languageSpoke + ", status=" + status + "]";
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

}
