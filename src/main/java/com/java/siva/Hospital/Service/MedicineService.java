package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.MedicineDto;
import com.java.siva.Hospital.Entity.Medicine;
import com.java.siva.Hospital.Enum.Status;

public interface MedicineService {

	public MedicineDto addMedicine(MedicineDto medicineDto, Status status);

	public List<Medicine> allMedicine();

	public void deleteMedicine(Long id);

	public MedicineDto updateMedicine(MedicineDto medicineDto, Long id);

	public MedicineDto findByMedicine(Long id);

}
