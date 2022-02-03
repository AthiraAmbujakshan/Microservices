package com.cognizant.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SSLResource {
	
	@GetMapping()
	public String hello() {
		return " welcome to secure https";
	}

}
