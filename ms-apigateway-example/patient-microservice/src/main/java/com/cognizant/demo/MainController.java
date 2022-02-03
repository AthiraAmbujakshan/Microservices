package com.cognizant.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/patients")
	public String Patient() {
		return "list of patients";
	}

}
