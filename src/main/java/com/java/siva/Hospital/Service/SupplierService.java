package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.SupplierDto;
import com.java.siva.Hospital.Entity.Supplier;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Enum.Type;

public interface SupplierService {

	public SupplierDto createSupplier(SupplierDto supplierDto, Type type, Status status);

	public List<Supplier> listOfSupplier();

	public SupplierDto updateSupplier(SupplierDto supplierDto, Long id);

	public String deleteSupplier(Long id);

	public SupplierDto findBySupplier(Long id);

}
