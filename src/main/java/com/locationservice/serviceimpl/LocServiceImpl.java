package com.locationservice.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.locationservice.entities.Cafe;
import com.locationservice.entities.Location;
import com.locationservice.entities.Rating;
import com.locationservice.repository.LocRepository;
import com.locationservice.services.LocService;

@Service
public class LocServiceImpl implements LocService {

	@Autowired
	private LocRepository locRepository;

	@Autowired
	private RestTemplate restTemplate;

	private Logger logger = LoggerFactory.getLogger(LocService.class);

	public Location create(Location location) {

		return locRepository.save(location);
	}

	@Override
	public List<Cafe> getbyCity(String city) {
		String url = "http://localhost:8098/cafe/location/" + city;

		List<Cafe> cafes = (List<Cafe>) restTemplate.getForObject(url, Object.class);

		return cafes;
	}
	
	@Override
	public Rating create(Rating rating) {
		
		String url="http://localhost:8097/rating";
		Rating rate=restTemplate.postForObject(url, rating, Rating.class);
		return rate;
		
	}

}
