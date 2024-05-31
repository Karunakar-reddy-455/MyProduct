package com.java.siva.Hospital.Dto;

import java.sql.Date;

import com.java.siva.Hospital.Enum.Gender;
import com.java.siva.Hospital.Enum.Status;

public class DoctorDto {
	private long doctorId;
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

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
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

}
