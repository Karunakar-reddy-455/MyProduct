package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.FlourDto;
import com.java.siva.Hospital.Entity.Flour;
import com.java.siva.Hospital.Enum.Status;

public interface FlourService {
	
	public Flour addFlour(Flour flour,Status status);
	
	public List<Flour> fetchFLour();
	
	public String deleteFlour(Long flourId);
	
	public Flour updateFlour(Flour flour,Long flourId);
	
	public Flour findByFlourId(Long flourId);
	
	public List<FlourDto> getHospitalId(Long hospitalId);
	
	

}
