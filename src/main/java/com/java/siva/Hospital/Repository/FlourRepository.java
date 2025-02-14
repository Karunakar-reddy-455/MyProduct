package com.java.siva.Hospital.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.siva.Hospital.Dto.FlourDto;
import com.java.siva.Hospital.Entity.Flour;

@Repository
public interface FlourRepository extends JpaRepository<Flour, Long> {

    @Query("SELECT new com.java.siva.Hospital.Dto.FlourDto(m.flourName, m.flourId, h.hospitalName, l.locationName) " +
           "FROM Flour m ,Hospital h,Locations l " +
           "WHERE m.hospitalId = h.hospitalId " +
           "AND m.locationId = l.locationId " +
           "AND h.hospitalId = :hospitalId")
    List<FlourDto> findFloursByHospitalId(@Param("hospitalId") Long hospitalId);
}


