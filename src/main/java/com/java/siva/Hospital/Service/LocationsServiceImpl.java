package com.java.siva.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.LocationDto;
import com.java.siva.Hospital.Entity.Locations;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Repository.LocationRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class LocationsServiceImpl implements LocationsService {

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Locations addLocations(Locations location, Status status) {
		if (status != null) {
			switch (status) {
			case ACTIVE:
			case BLOCKED:
			case INACTIVE:
				location.setStatus(status);
				break;
			}
		}

		return locationRepository.save(location);
	}

	@Override
	public List<Locations> fetchAllLocations() {
		return locationRepository.findAll();
	}

	@Override
	public Locations updateLocation(Locations location, Long locationId) {
		if (locationRepository.findById(locationId).isPresent()) {
			return locationRepository.save(location);
		} else {
			throw new IdNotFoundException("LocationId is not Present: " + locationId);
		}
	}

	@Override
	public String deleteLocation(Long locationId) {
		if (locationRepository.findById(locationId).isPresent()) {
			locationRepository.deleteById(locationId);
			return "Delete Successfully";
		} else {
			throw new IdNotFoundException("LocationId is not Present: " + locationId);
		}
	}

	@Override
	public List<LocationDto> findByHospital(Long hospitalId) {
		return locationRepository.findLocationsByHospitalId(hospitalId);
	}
//	@Override
//	public List<Flour> findByFlourId(Long locationId) {
//		return locationRepository.findByLocationId(locationId);
//	}

}
