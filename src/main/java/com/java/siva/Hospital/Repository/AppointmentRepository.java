package com.java.siva.Hospital.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.java.siva.Hospital.Dto.AppointmentDto;
import com.java.siva.Hospital.Entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    @Query("SELECT new com.java.siva.Hospital.Dto.AppointmentDto(a.appointmentId, d.doctorName, h.hospitalName,h.hospitalEmail,h.hospitalAddress,d.phoneNumber,d.email,p.firstName,p.adhar)" +
           "FROM Appointment a " +
           "JOIN a.hospital h " +
           "JOIN a.doctor d " +
           "JOIN a.patient p " +
           "WHERE h.hospitalId = :hospitalId")
    List<AppointmentDto> findAppointmentDetailsByHospitalId(@Param("hospitalId") Long hospitalId);
}
