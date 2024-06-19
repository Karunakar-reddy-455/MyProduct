package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.LocationDto;
import com.java.siva.Hospital.Entity.Locations;
import com.java.siva.Hospital.Enum.Status;

public interface LocationsService {
	
	public Locations addLocations(Locations location,Status status);
	
	public List<Locations> fetchAllLocations();
	
	public  Locations updateLocation(Locations location,Long locationId);
	
	public String deleteLocation(Long locationId);
	
	public List<LocationDto> findByHospital(Long hospitalId);
	
//	public List<Flour> findByFlourId(Long locationId);
}
