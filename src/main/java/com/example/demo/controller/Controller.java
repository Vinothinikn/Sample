package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/display")
public class Controller {

	@GetMapping("/message")
	public String displayMessage(){
		return "Welcome";
		
	}
}
