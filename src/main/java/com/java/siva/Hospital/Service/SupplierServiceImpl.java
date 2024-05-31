package com.java.siva.Hospital.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.SupplierDto;
import com.java.siva.Hospital.Entity.Supplier;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Enum.Type;
import com.java.siva.Hospital.Repository.SupplierRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public SupplierDto createSupplier(SupplierDto supplierDto, Type type, Status status) {
		if (type != null) {
			switch (type) {
			case ADMIN:
			case EMP:
			case MASTER:
			case OTHER:
				supplierDto.setType(type);
				break;
			}
		}
		if (status != null) {
			switch (status) {
			case ACTIVE:
			case BLOCKED:
			case INACTIVE:
				supplierDto.setStatus(status);
				break;
			}
		}
		Supplier supplier = modelMapper.map(supplierDto,Supplier.class);
		supplier = supplierRepository.save(supplier);
		return modelMapper.map(supplier,SupplierDto.class);
	}

	@Override
	public List<Supplier> listOfSupplier() {
		return supplierRepository.findAll();
	}

	@Override
	public SupplierDto updateSupplier(SupplierDto supplierDto, Long id) {
		Optional<Supplier> supp = supplierRepository.findById(id);
		if (supp.isPresent()) {
			Supplier supplier = modelMapper.map(supplierDto,Supplier.class);
			supplier = supplierRepository.save(supplier);
			return modelMapper.map(supplier,SupplierDto.class);
		} else {
			throw new IdNotFoundException("Supplier Id is not present" + " " + id);
		}
	}

	@Override
	public String deleteSupplier(Long id) {
		if(supplierRepository.findById(id).isPresent()) {
		supplierRepository.deleteById(id);
		return "Deleted Successfully";
		}
		else {
			throw new IdNotFoundException("SupplierId" +" " + id + " " + "is not present");
		}
		
	}

	@Override
	public SupplierDto findBySupplier(Long id) {
		Optional<Supplier> supplier = supplierRepository.findById(id);
		if (supplier.isPresent()) {
			ModelMapper modelMapper = new ModelMapper();
			return modelMapper.map(supplier, SupplierDto.class);
		} else {
			throw new IdNotFoundException("Supplier not found with id: " + id);
		}

	}
}
