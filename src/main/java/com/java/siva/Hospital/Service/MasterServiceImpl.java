package com.java.siva.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.siva.Hospital.Entity.Master;
import com.java.siva.Hospital.Repository.MasterRepository;

@Service
public class MasterServiceImpl implements MasterService {
	
	@Autowired
	private MasterRepository masterRepository;

	@Override
	public List<Master> fetchAll() {
		return masterRepository.findAll();
	}

	@Override
	public Master updateMaster(Long masterId, Master master) {
		Master master1 =	masterRepository.findById(masterId).get();
		master1.setAddress(master.getAddress());
		return masterRepository.save(master1);
	}

}
