package com.java.siva.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.siva.Hospital.Entity.Rooms;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms, Long>{

}
