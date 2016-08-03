package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	

	@GetMapping("/herokutryout")
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("I am at SpringOne conference and i deployed to Heroku");
	}

}
