package com.java.siva.Hospital.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.siva.Hospital.Dto.RoomsDto;
import com.java.siva.Hospital.Entity.Rooms;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms, Long>{
	
	@Query("SELECT new com.java.siva.Hospital.Dto.RoomsDto(r.roomId, r.roomName, h.hospitalId, h.hospitalName, l.locationName, f.flourName) " + 
	"FROM Rooms r, Hospital h, Locations l, Flour f " +
			"WHERE r.hospitalId = h.hospitalId " +
			"AND r.locationId = l.locationId " + 
			"AND r.flourId = f.flourId " + 
			"AND h.hospitalId = :hospitalId ")
	List<RoomsDto> findRoomsByHospitalId(@Param("hospitalId") Long hospitalId);
	


}
