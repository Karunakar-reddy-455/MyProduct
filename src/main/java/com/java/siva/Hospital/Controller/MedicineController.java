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

import com.java.siva.Hospital.Dto.MedicineDto;
import com.java.siva.Hospital.Entity.Medicine;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Service.MedicineService;

@RestController
@CrossOrigin
public class MedicineController {

	@Autowired
	private MedicineService medicineService;

	@PostMapping("/addMedicine")
	public ResponseEntity<Medicine> addMedicine(@RequestBody Medicine medicine, Status status) {
		return new ResponseEntity<Medicine>(medicineService.addMedicine(medicine, status), HttpStatus.CREATED);
	}

	@GetMapping("/getallmedicine")
	public ResponseEntity<List<Medicine>> fetchAll() {
		return new ResponseEntity<List<Medicine>>(medicineService.allMedicine(), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/deleteMedicine/{id}")
	public void deleteMedicine(@PathVariable Long id) {
		medicineService.deleteMedicine(id);
	}

	@PutMapping("/updateMadicine/{id}")
	public ResponseEntity<Medicine> updateMedicine(@RequestBody Medicine medicine, @PathVariable Long id) {
		return new ResponseEntity<>(medicineService.updateMedicine(medicine, id), HttpStatus.IM_USED);
	}

	@GetMapping("/findBYMedicine/{id}")
	public ResponseEntity<MedicineDto> findByMedicine(@PathVariable Long id) {
		return new ResponseEntity<MedicineDto>(medicineService.findByMedicine(id), HttpStatus.ACCEPTED);
	}

}
