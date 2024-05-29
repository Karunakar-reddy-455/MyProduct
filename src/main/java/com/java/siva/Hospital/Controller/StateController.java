package com.java.siva.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.siva.Hospital.Entity.State;
import com.java.siva.Hospital.Service.StateService;

@RestController
public class StateController {

	@Autowired
	private StateService stateService;

	@PostMapping("addState")
	public ResponseEntity<State> save(@RequestBody State state) {
		return new ResponseEntity<State>(stateService.saveState(state), HttpStatus.ACCEPTED);
	}

	@GetMapping("getState")
	public ResponseEntity<List<State>> fetchState() {
		return new ResponseEntity<List<State>>(stateService.fetchAll(), HttpStatus.OK);
	}

	@DeleteMapping("state/{stateId}")
	public ResponseEntity<String> deleteState(@PathVariable Long stateId) {
		stateService.deleteState(stateId);
		return new ResponseEntity<String>("Deleted Done", HttpStatus.ACCEPTED);
	}

	@PutMapping("state/{stateId}")
	public ResponseEntity<State> updateState(@RequestBody State state, @PathVariable Long stateId) {
		return new ResponseEntity<State>(stateService.saveState(state), HttpStatus.ACCEPTED);
	}

	@GetMapping("findstate/{stateId}")
	public ResponseEntity<State> findByStateId(@PathVariable Long stateId) {
		return new ResponseEntity<State>(stateService.findByStateId(stateId), HttpStatus.ACCEPTED);
	}

	@GetMapping("api/{countryId}")
	public ResponseEntity<List<State>> findByCountryId(@PathVariable Long countryId) {
		return new ResponseEntity<List<State>>(stateService.findByCountryId(countryId), HttpStatus.ACCEPTED);
	}

}
