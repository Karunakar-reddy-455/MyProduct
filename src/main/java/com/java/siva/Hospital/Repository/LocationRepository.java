package com.java.siva.Hospital.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.siva.Hospital.Dto.LocationDto;
import com.java.siva.Hospital.Entity.Locations;

@Repository
public interface LocationRepository extends JpaRepository<Locations, Long> {

    
    @Query("SELECT new com.java.siva.Hospital.Dto.LocationDto(l.locationId, h.hospitalName, h.hospitalEmail, h.mobile, l.locationName) " +
    	       "FROM Locations l, Hospital h " +  // Added space after 'Hospital h'
    	       "WHERE l.hospitalId = h.hospitalId " + // Added space before 'AND'
    	       "AND h.hospitalId = :hospitalId")
    	List<LocationDto> findLocationsByHospitalId(@Param("hospitalId") Long hospitalId);

	
//	public List<Flour> findByLocationId(Long locationId);
}
