package com.locationservice.services;

import java.util.List;

import com.locationservice.entities.Cafe;
import com.locationservice.entities.Rating;

public interface LocService {

	List<Cafe> getbyCity(String city);
	
	Rating create(Rating rating);

}
