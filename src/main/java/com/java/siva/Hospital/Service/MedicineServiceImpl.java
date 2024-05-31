package com.java.siva.Hospital.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.MedicineDto;
import com.java.siva.Hospital.Entity.Medicine;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Repository.MedicineRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public MedicineDto addMedicine(MedicineDto medicineDto, Status status) {
		if (status != null) {
			switch (status) {
			case ACTIVE:
			case BLOCKED:
			case INACTIVE:
				medicineDto.setStatus(status);
				break;
			}
		}

		Medicine medicine = modelMapper.map(medicineDto, Medicine.class);
		medicine = medicineRepository.save(medicine);
		return modelMapper.map(medicine, MedicineDto.class);
	}

	@Override
	public List<Medicine> allMedicine() {
		return medicineRepository.findAll();
	}

	@Override
	public void deleteMedicine(Long id) {
		if (medicineRepository.findById(id).isPresent()) {
			medicineRepository.deleteById(id);
		} else {
			throw new IdNotFoundException("Medicine Id is Not present in tabel" + " " + id);
		}
	}

	@Override
	public MedicineDto findByMedicine(Long id) {
		Optional<Medicine> medicine = medicineRepository.findById(id);
		if (medicine.isPresent()) {
			return modelMapper.map(medicine, MedicineDto.class);

		} else {
			throw new IdNotFoundException("medicine not found with id: " + id);
		}
	}

	@Override
	public MedicineDto updateMedicine(MedicineDto MedicineDto, Long id) {
		Optional<Medicine> m = medicineRepository.findById(id);
		if (m.isPresent()) {
			Medicine medicine = modelMapper.map(MedicineDto,Medicine.class);
			medicine= medicineRepository.save(medicine);
			return  modelMapper.map(medicine, MedicineDto.class);
		} else {
			throw new IdNotFoundException("Medicine id not present" + " " + id);
		}
	}
}
