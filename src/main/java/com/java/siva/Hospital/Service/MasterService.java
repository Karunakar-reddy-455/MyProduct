package com.java.siva.Hospital.Service;

import java.util.List;

import com.java.siva.Hospital.Entity.Master;

public interface MasterService {
	
	public List<Master>fetchAll();
	
	public Master updateMaster(Long masterId,Master master);

}
