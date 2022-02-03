package com.cognizant.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/diseases")
	public String Patient() {
		/* try {
			Thread.sleep(20,000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}*/
		return "list of diseases";
	}

}
