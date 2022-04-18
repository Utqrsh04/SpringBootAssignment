package com.utqrsh.Assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.utqrsh.Assignment.model.Zipcode;


@Repository
public interface ZipcodeRepository extends JpaRepository<Zipcode, Integer> {
	
	@Query(value = "select distinct(state) from zipcodes" ,nativeQuery = true)
	public List<String> getAllStatesRepo();

	
	@Query(value = "select distinct(city) from zipcodes where state = :state", nativeQuery = true)
	public List<String> getCityByStateRepo(@Param("state") String state);
	
	@Query(value = "select zip from zipcodes where state = :state AND city = :city" , nativeQuery = true)
	public List<Integer> getZipByCityAndStateRepo(@Param("state")String state, @Param("city")String city);
	
}
