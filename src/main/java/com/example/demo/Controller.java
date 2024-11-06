package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {
	
	@GetMapping("/")
	public String getMethodName() {
		return "Welcome to devops";
	}
	
	@GetMapping("/userName")
	public String  getName(@RequestParam String userName) {
		
		return "Welome to QA Team"+userName.toString();
	}
	

}
