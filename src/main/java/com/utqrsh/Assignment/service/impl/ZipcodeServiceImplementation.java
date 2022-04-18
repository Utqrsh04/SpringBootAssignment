package com.utqrsh.Assignment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utqrsh.Assignment.repository.ZipcodeRepository;
import com.utqrsh.Assignment.service.ZipcodeService;

@Service
public class ZipcodeServiceImplementation implements ZipcodeService{

	@Autowired
	private ZipcodeRepository zipcodeRepository;
	
	@Override
	public List<String> getAllStates() {
		System.out.println("In implementation");
		// TODO Auto-generated method stub
		return zipcodeRepository.getAllStatesRepo();
	}

	
	@Override
	public List<String> getCityByState(String state) {
		// TODO Auto-generated method stub
		return zipcodeRepository.getCityByStateRepo(state);
	}

	
	@Override
	public List<Integer> getZipByCityAndState(String state, String city) {
		// TODO Auto-generated method stub
		return zipcodeRepository.getZipByCityAndStateRepo(state, city);
	}
	
	
	
}
