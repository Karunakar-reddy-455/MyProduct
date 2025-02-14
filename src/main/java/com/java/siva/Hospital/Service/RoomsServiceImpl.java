package com.java.siva.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Dto.RoomsDto;
import com.java.siva.Hospital.Entity.Rooms;
import com.java.siva.Hospital.Enum.Status;
import com.java.siva.Hospital.Repository.RoomsRepository;
import com.java.siva.Hospital.exception.IdNotFoundException;

@Service
public class RoomsServiceImpl implements RoomsService {

	@Autowired
	private RoomsRepository roomsRepository;

	@Override
	public Rooms addRooms(Rooms rooms, Status status) {

		if (status != null) {
			switch (status) {
			case ACTIVE:
			case BLOCKED:
			case INACTIVE:
				rooms.setStatus(status);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + status);
			}
		}

		return roomsRepository.save(rooms);
	}

	@Override
	public List<Rooms> fetchRooms() {
		return roomsRepository.findAll();
	}

	@Override
	public String deleteRooms(Long roomsId) {
		if (roomsRepository.findById(roomsId).isPresent()) {
			roomsRepository.deleteById(roomsId);
		}

		return "Successfully deleted";
	}

	@Override
	public Rooms updateRooms(Rooms rooms, Long roomsId) {
		if (roomsRepository.findById(roomsId).isPresent()) {
			return roomsRepository.save(rooms);
		} else {
			throw new IdNotFoundException("HospitalUpdated id not found with id: " + roomsId);
		}
	}

	@Override
	public Rooms findByRoomsId(Long roomsId) {
		if (roomsRepository.findById(roomsId).isPresent()) {
		return roomsRepository.findById(roomsId).get();
	}
		else {
			throw new IdNotFoundException("HospitalUpdated id not found with id: " + roomsId);
		}
	}

	@Override
	public List<RoomsDto> getHospitalId(Long hospitalId) {
		return roomsRepository.findRoomsByHospitalId(hospitalId);
	}

}
