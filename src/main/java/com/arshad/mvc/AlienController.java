package com.arshad.mvc;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arshad.mvc.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@Autowired
	AlienService service;
	
	
	@GetMapping("/aliens")
	public List<Alien> getAliens() {
		
		List<Alien> aliens = repo.findAll();
		return aliens;
	}
	
	
	@GetMapping("alien/{aid}")
	public Alien getAlien(@PathVariable("aid") int aid) {
		Alien alien = repo.findById(aid).orElse(null);
		return alien;
	}
	
	@PostMapping("alien")
	public Alien addAlien(Alien alien) {
		alien = repo.save(alien);
		return alien;
	}
	
	@DeleteMapping("alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		return service.deleteAlien(aid);
		
	}
	
	
	
	
	
	
	
}
