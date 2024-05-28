package com.java.siva.Hospital.Entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.java.siva.Hospital.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@CrossOrigin
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String medisienName;
	private int medisienPower;
	private int quantity;
	private double price;
	@Enumerated(EnumType.STRING)
	private Status status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMedisienPower() {
		return medisienPower;
	}

	public void setMedisienPower(int medisienPower) {
		this.medisienPower = medisienPower;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * 
	 */
	public Medicine() {
		super();
	}

	/**
	 * @param id
	 * @param medisienName
	 * @param medisienPower
	 * @param quantity
	 * @param price
	 * @param status
	 */
	public Medicine(long id, String medisienName, int medisienPower, int quantity, double price, Status status) {
		super();
		this.id = id;
		this.medisienName = medisienName;
		this.medisienPower = medisienPower;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
	}

	public String getMedisienName() {
		return medisienName;
	}

	public void setMedisienName(String medisienName) {
		this.medisienName = medisienName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", medisienName=" + medisienName + ", medisienPower=" + medisienPower
				+ ", quantity=" + quantity + ", price=" + price + ", status=" + status + "]";
	}

}
