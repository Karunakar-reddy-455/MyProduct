package com.java.siva.Hospital.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long appointmentId;
	
	private long hospitalId;
	private long doctorId;
	private long patientId;
//	@ManyToOne
//	@JoinColumn(name = "doctor_id")
//	private Doctor doctor;
//
//	@ManyToOne
//	@JoinColumn(name = "patient_id")
//	private Patient patient;
//
//	@ManyToOne
//	@JoinColumn(name = "hospital_id")
//	private Hospital hospital;

	private Date onDate;
	private String reason;
	private String description;
	
	
	
	
	

	public long getAppointmentId() {
		return appointmentId;
	}

	/**
	 * 
	 */
	public Appointment() {
		super();
	}

	/**
	 * @param appointmentId
	 * @param hospitalId
	 * @param doctorId
	 * @param patientId
	 * @param onDate
	 * @param reason
	 * @param description
	 */
	public Appointment(long appointmentId, long hospitalId, long doctorId, long patientId, Date onDate, String reason,
			String description) {
		super();
		this.appointmentId = appointmentId;
		this.hospitalId = hospitalId;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.onDate = onDate;
		this.reason = reason;
		this.description = description;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	
	

 
	public Date getOnDate() {
		return onDate;
	}

	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", hospitalId=" + hospitalId + ", doctorId=" + doctorId
				+ ", patientId=" + patientId + ", onDate=" + onDate + ", reason=" + reason + ", description="
				+ description + "]";
	}

//	/**
//	 * @param appointmentId
//	 * @param doctor
//	 * @param patient
//	 * @param hospital
//	 * @param onDate
//	 * @param reason
//	 * @param description
//	 */
//	public Appointment(long appointmentId, Doctor doctor, Patient patient, Hospital hospital,
//			Date onDate, String reason, String description) {
//		super();
//		this.appointmentId = appointmentId;
//		this.doctor = doctor;
//		this.patient = patient;
//		this.hospital = hospital;
//		this.onDate = onDate;
//		this.reason = reason;
//		this.description = description;
//	}
//
//	/**
//	 * 
//	 */
//	public Appointment() {
//		super();
//	}
//
//	@Override
//	public String toString() {
//		return "Appointment [appointmentId=" + appointmentId + ", doctor=" + doctor + ", patient=" + patient
//				+ ", hospital=" + hospital + ", onDate=" + onDate + ", reason=" + reason + ", description="
//				+ description + "]";
//	}

}
