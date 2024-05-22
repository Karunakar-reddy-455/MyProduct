package com.java.siva.Hospital.Dto;

import java.sql.Date;

import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;

public class DoctorDto {
	private long id;
	private String doctorName;
	private Date dateOfBirth;
	private Gender gender;
	private long phoneNumber;
	private String email;
	private String address;
	private int medicalLicenseNumber;
	private String specialization;
	private String languageSpoke;
	private Status status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
	public DoctorDto(long id, String doctorName, Date dateOfBirth, Gender gender, long phoneNumber, String email,
			String address, int medicalLicenseNumber, String specialization, String languageSpoke, Status status) {
		super();
		this.id = id;
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
	public DoctorDto() {
		super();
	}

	@Override
	public String toString() {
		return "DoctorDto [id=" + id + ", doctorName=" + doctorName + ", dateOfBirth=" + dateOfBirth + ", gender="
				+ gender + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", medicalLicenseNumber=" + medicalLicenseNumber + ", specialization=" + specialization
				+ ", languageSpoke=" + languageSpoke + ", status=" + status + "]";
	}

}
