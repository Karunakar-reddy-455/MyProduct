package com.java.siva.Hospital.Dto;

import com.java.siva.Hospital.Enum.Status;

public class MedicineDto {
	private long id;
	private String medisienName;
	private int medisienPower;
	private int quantity;
	private Status status;
	private double price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMedisienName() {
		return medisienName;
	}

	public void setMedisienName(String medisienName) {
		this.medisienName = medisienName;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
