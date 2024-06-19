package com.java.siva.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Dto.LocationDto;
import com.java.siva.Hospital.Entity.Locations;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Service.LocationsService;

@RestController
@RequestMapping("/api")
public class LocationController {

    @Autowired
    private LocationsService locationService;

    @PostMapping("/location")
    public Locations addLocation(@RequestBody Locations location, Status status) {
        return locationService.addLocations(location, status);
    }

    @GetMapping("/getAllLocation")
    public List<Locations> getAllLocations() {
        return locationService.fetchAllLocations();
    }

    @DeleteMapping("/delete/{locationId}")
    public String deleteLocation(@PathVariable Long locationId) {
        locationService.deleteLocation(locationId);
        return "Location Deleted Successfully";
    }

    @PutMapping("/update/{locationId}")
    public Locations updateLocation(@RequestBody Locations location, @PathVariable Long locationId) {
        return locationService.updateLocation(location, locationId);
    }
    
    @GetMapping("/hospital/{hospitalId}")
    public List<LocationDto> getHospitalId(@PathVariable Long hospitalId){
    	return locationService.findByHospital(hospitalId);
    }
//    @GetMapping("/flour/{locationId}")
//    public List<Flour> getFlour(@PathVariable Long locationId){
//    	return locationService.findByFlourId(locationId);
//    }
}
