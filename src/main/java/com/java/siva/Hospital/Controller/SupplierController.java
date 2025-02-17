package com.java.siva.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Dto.SupplierDto;
import com.java.siva.Hospital.Entity.Supplier;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Enum.Type;
import com.java.siva.Hospital.Service.SupplierService;

@RestController
@CrossOrigin
public class SupplierController {

	@Autowired
	private SupplierService supplierService;

	@PostMapping("/addsupplier")
	public ResponseEntity<SupplierDto> saveSupplier(@RequestBody SupplierDto supplierDto, Type type, Status status) {
		return new ResponseEntity<SupplierDto>(supplierService.createSupplier(supplierDto, type, status), HttpStatus.CREATED);
	}

	@GetMapping("/getAllSuppliers")
	public ResponseEntity<List<Supplier>> getAllSuppliers() {
		return new ResponseEntity<List<Supplier>>(supplierService.listOfSupplier(), HttpStatus.OK);
	}

	@PutMapping("/updateSupplier/{id}")
	public ResponseEntity<SupplierDto> updateSupplier(@RequestBody SupplierDto supplierDto, @PathVariable Long id) {
		return new ResponseEntity<SupplierDto>(supplierService.updateSupplier(supplierDto, id), HttpStatus.CREATED);
	}

	@DeleteMapping("/deletedSupplier/{id}")
	public ResponseEntity<String> deleteSupplier(@PathVariable Long id) {
		String message = supplierService.deleteSupplier(id);
		if (message.equals("Deleted Successfully")) {
			return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Deletion failed: " + message, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/getSupplier/{id}")
	public ResponseEntity<SupplierDto> findSupplier(@PathVariable Long id) {
		return new ResponseEntity<SupplierDto>(supplierService.findBySupplier(id), HttpStatus.FOUND);
	}

}
