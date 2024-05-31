package com.java.siva.Hospital.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Entity.Master;
import com.java.siva.Hospital.Service.MasterService;

@RestController
public class MasterController {
	@Autowired
	private MasterService masterService;

	private final Logger logger = LoggerFactory.getLogger(MasterController.class);

	@GetMapping("/get/master")
	public ResponseEntity<List<Master>> fetchAll() {
		logger.info("Data Is Retrived Successfully");
		return new ResponseEntity<List<Master>>(masterService.fetchAll(), HttpStatus.ACCEPTED);
	}

	@PutMapping("master/updateMaster/{masterId}")
	public ResponseEntity<Master> updateMasterAddress(@PathVariable Long masterId, @RequestBody Master master) {
		logger.info("Only AddressData is update");
		return new ResponseEntity<Master>(masterService.updateMaster(masterId, master), HttpStatus.OK);
	}
}
