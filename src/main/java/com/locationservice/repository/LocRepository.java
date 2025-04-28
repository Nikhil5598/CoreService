package com.locationservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locationservice.entities.Location;

public interface LocRepository extends JpaRepository<Location, Integer> {
	
	
	
	List<Location>findByPincode(String pincode);
		
	Location findByState(String state);
	
	Location findByCountry(String country);

}
