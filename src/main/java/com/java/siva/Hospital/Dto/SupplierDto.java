package com.java.siva.Hospital.Dto;

import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Enum.Type;

public class SupplierDto {

	private long id;
	private long hospitalId;
	private Type type;
	private String userName;
	private String password;
	private Status status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @param id
	 * @param hospitalId
	 * @param type
	 * @param userName
	 * @param password
	 * @param status
	 */
	public SupplierDto(long id, long hospitalId, Type type, String userName, String password, Status status) {
		super();
		this.id = id;
		this.hospitalId = hospitalId;
		this.type = type;
		this.userName = userName;
		this.password = password;
		this.status = status;
	}

	/**
	 * 
	 */
	public SupplierDto() {
		super();
	}

	@Override
	public String toString() {
		return "SupplierDto [id=" + id + ", hospitalId=" + hospitalId + ", type=" + type + ", userName=" + userName
				+ ", password=" + password + ", status=" + status + "]";
	}
}
