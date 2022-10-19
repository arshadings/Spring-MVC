package com.arshad.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlienService {
	
	@Autowired
	AlienRepo repo;
	
	public String deleteAlien(int aid) {
		repo.deleteById(aid);
		return "Deleted"+aid;
	}
}
