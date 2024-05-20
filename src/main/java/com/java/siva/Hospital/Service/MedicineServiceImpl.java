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
	public Medicine addMedicine(Medicine medicine, Status status) {
		if (status != null) {
			switch (status) {
			case ACTIVE:
			case BLOCKED:
			case INACTIVE:
				medicine.setStatus(status);
				break;
			}
		}
		return medicineRepository.save(medicine);
	}

	@Override
	public List<Medicine> allMedicine() {
		return medicineRepository.findAll();
	}

	@Override
	public void deleteMedicine(Long id) {
		medicineRepository.deleteById(id);
	}

	@Override
	public MedicineDto findByMedicine(Long id) {
		Optional<Medicine> medicine = medicineRepository.findById(id);
		if (medicine.isPresent()) {
			// ModelMapper modelMapper = new ModelMapper();
			return modelMapper.map(medicine, MedicineDto.class);

		} else {
			throw new IdNotFoundException("Supplier not found with id: " + id);
		}
	}

	@Override
	public Medicine updateMedicine(Medicine medicine, Long id) {
		return medicineRepository.save(medicine);
	}
}
