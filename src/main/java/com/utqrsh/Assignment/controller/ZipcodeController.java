package com.utqrsh.Assignment.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utqrsh.Assignment.service.ZipcodeService;

@RestController
@RequestMapping("/zipcode")
public class ZipcodeController {

	@Autowired
	private ZipcodeService zipcodeService;
	
	
	//GET all states
	@GetMapping("states/all")
	public ResponseEntity<List<String>> getAllstates(){		
		List<String> stateList = null;
		try {
			stateList = zipcodeService.getAllStates();
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<List<String>>(stateList, HttpStatus.OK);
	}
	
		
	
	//GET all cities by State	
	@GetMapping("city/{state}")
	public ResponseEntity<List<String>> getCityByState(@PathVariable(value = "state" ) String state){
		
		List<String> cities = null;
		try {
			cities = zipcodeService.getCityByState(state) ;
			
		} catch (Exception e) {
			e.getMessage();
		}
				
		return new ResponseEntity<List<String>>(cities , HttpStatus.OK) ;
	}
	
	
	
	//get all zip codes of state and city 
	@GetMapping("/{state}/{city}")
	public ResponseEntity<List<Integer>> getZipByCity(@PathVariable(value = "state" ) String state, @PathVariable(value = "city" ) String city ){
		
		List<Integer> zips = null;
		try {
			zips = zipcodeService.getZipByCityAndState(state, city);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<List<Integer>>(zips , HttpStatus.OK) ;
	}
	
	
	
}
