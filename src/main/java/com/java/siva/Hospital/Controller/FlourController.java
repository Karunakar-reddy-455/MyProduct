package com.java.siva.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Dto.FlourDto;
import com.java.siva.Hospital.Entity.Flour;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Service.FlourService;

@RestController
public class FlourController {

	@Autowired
	private FlourService flourService;

	@PostMapping("/api/flour")
	public Flour saveFlour(@RequestBody Flour flour,Status status) {
		return flourService.addFlour(flour, status);
	}

	@GetMapping("/api/fetchall")
	public List<Flour> getAll() {
		return flourService.fetchFLour();
	}
	
	@PutMapping("/api/flour/{flourId}")
	public Flour updateFlour(@RequestBody Flour flour,@PathVariable Long flourId) {
		return flourService.updateFlour(flour, flourId);
	}
	
	@DeleteMapping("/api/delete/{flourId}")
	public String deleteFlour(@PathVariable Long flourId) {
		flourService.deleteFlour(flourId);
		return "Deleted";
	}
	
	@GetMapping("/api/hospitalflour/{hospitalId}")
	public List<FlourDto> getHospital(@PathVariable Long hospitalId){
		return flourService.getHospitalId(hospitalId);
	}


}
