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

import com.java.siva.Hospital.Dto.RoomsDto;
import com.java.siva.Hospital.Entity.Rooms;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Service.RoomsService;

@RestController
@RequestMapping("/api")
public class RoomsController {

	@Autowired
	private RoomsService roomsService;

	@PostMapping("/addroom")
	public Rooms addRooms(@RequestBody Rooms rooms, Status status) {
		return roomsService.addRooms(rooms, status);
	}

	@GetMapping("/getAllRoom")
	public List<Rooms> getAllRooms() {
		return roomsService.fetchRooms();
	}

	@DeleteMapping("/delete/{roomsId}")
	public String deleteLocation(@PathVariable Long roomsId) {
		roomsService.deleteRooms(roomsId);
		return "Location Deleted Successfully";
	}

	@PutMapping("/update/{roomsId}")
	public Rooms updateRooms(@RequestBody Rooms rooms, @PathVariable Long roomsId) {
		return roomsService.updateRooms(rooms, roomsId);
	}

	@GetMapping("/getAllRoom/{roomsId}")
	public Rooms findRoomId(@PathVariable Long roomsId) {
		return roomsService.findByRoomsId(roomsId);
	}

	@GetMapping("/hospital/rooms/{hospitalId}")
	public List<RoomsDto> fetchHospitalId(@PathVariable Long hospitalId) {
		return roomsService.getHospitalId(hospitalId);
	}

}
