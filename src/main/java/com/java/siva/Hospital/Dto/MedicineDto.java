package com.java.siva.Hospital.Dto;

public class MedicineDto {
	private long id;
	private String medisienName;
	private int medisienPower;
	private int quantity;

	/**
	 * 
	 */
	public MedicineDto() {
		super();
	}

	/**
	 * @param id
	 * @param medisienName
	 * @param medisienPower
	 * @param quantity
	 */
	public MedicineDto(long id, String medisienName, int medisienPower, int quantity) {
		super();
		this.id = id;
		this.medisienName = medisienName;
		this.medisienPower = medisienPower;
		this.quantity = quantity;
	}

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

	@Override
	public String toString() {
		return "MedicineDto [id=" + id + ", medisienName=" + medisienName + ", medisienPower=" + medisienPower
				+ ", quantity=" + quantity + "]";
	}

}
