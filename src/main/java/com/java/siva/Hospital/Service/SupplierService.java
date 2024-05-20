package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.SupplierDto;
import com.java.siva.Hospital.Entity.Supplier;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Enum.Type;

public interface SupplierService {

	public Supplier createSupplier(Supplier supplier, Type type, Status status);

	public List<Supplier> listOfSupplier();

	public Supplier updateSupplier(Supplier supplier, Long id);

	public String deleteSupplier(Long id);

	public SupplierDto findBySupplier(Long id);

}
