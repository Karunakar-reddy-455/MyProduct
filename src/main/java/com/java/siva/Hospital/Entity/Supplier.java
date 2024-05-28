package com.java.siva.Hospital.Entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Enum.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@CrossOrigin
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long hospitalId;
	@Enumerated(EnumType.STRING)
	private Type type;
	private String userName;
	private String password;
	@Enumerated(EnumType.STRING)
	private Status status;

	/**	
	 * 
	 */
	public Supplier() {
		super();
	}

	/**
	 * @param id
	 * @param hospitalId
	 * @param type
	 * @param userName
	 * @param password
	 * @param status
	 */
	public Supplier(long id, long hospitalId, Type type, String userName, String password, Status status) {
		super();
		this.id = id;
		this.hospitalId = hospitalId;
		this.type = type;
		this.userName = userName;
		this.password = password;
		this.status = status;
	}

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

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", hospitalId=" + hospitalId + ", type=" + type + ", userName=" + userName
				+ ", password=" + password + ", status=" + status + "]";
	}

}
