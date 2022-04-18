package com.utqrsh.Assignment.service;

import java.util.List;


public interface ZipcodeService {
	
	public List<String> getAllStates();
	
	public List<String> getCityByState(String state);
	
	public List<Integer> getZipByCityAndState(String state , String city);
	
}
