package com.java.siva.Hospital.Dto;

public class AppointmentDto {
	/**
	 * @param appointmentId
	 * @param doctorName
	 * @param hospitalName
	 * @param hospitalEmail
	 * @param hospitalAddress
	 * @param phoneNumber
	 * @param email
	 * @param patientName
	 * @param patientAdhar
	 */
	public AppointmentDto(long appointmentId, String doctorName, String hospitalName, String hospitalEmail,
			String hospitalAddress, long phoneNumber, String email, String patientName, long patientAdhar) {
		super();
		this.appointmentId = appointmentId;
		this.doctorName = doctorName;
		this.hospitalName = hospitalName;
		this.hospitalEmail = hospitalEmail;
		this.hospitalAddress = hospitalAddress;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.patientName = patientName;
		this.patientAdhar = patientAdhar;
	}

	private long appointmentId;
	private String doctorName;
	private String hospitalName;
	private String hospitalEmail;
	private String hospitalAddress;
	private long phoneNumber;
	private String email;
	private String patientName;
	private long patientAdhar;

	

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
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

	public long getPatientAdhar() {
		return patientAdhar;
	}

	public void setPatientAdhar(long patientAdhar) {
		this.patientAdhar = patientAdhar;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

}
