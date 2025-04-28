package com.locationservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locationservice.entities.Cafe;
import com.locationservice.entities.Rating;
import com.locationservice.services.LocService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private LocService locService;
	
	

	@GetMapping("/{city}")
	public ResponseEntity<List<Cafe>> getByCiti(@PathVariable String city) {
		List<Cafe> user = locService.getbyCity(city);
		return ResponseEntity.ok(user);
	}
	
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(locService.create(rating));
	}

}
