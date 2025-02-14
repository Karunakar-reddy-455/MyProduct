package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Dto.RoomsDto;
import com.java.siva.Hospital.Entity.Rooms;
import com.java.siva.Hospital.Enum.Status;



public interface RoomsService {
	
public Rooms addRooms(Rooms rooms,Status status);
	
	public List<Rooms> fetchRooms();
	
	public String deleteRooms(Long roomsId);
	
	public Rooms updateRooms(Rooms rooms,Long roomsId);
	
	public Rooms findByRoomsId(Long roomsId);
	
	public List<RoomsDto> getHospitalId(Long hospitalId);


}
