package com.pfe.testTechnique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/test")
public class TextController {

	
	@Autowired
	private TextService textservice;
	

	@PostMapping("/calculer")
	public int CountPunctuation(@RequestBody String text) {
		
		int nbr = this.textservice.countPunctuation(text);
		
		return nbr;
	}
	
}
