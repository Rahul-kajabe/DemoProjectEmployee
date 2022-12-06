package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/data")
	public String getData() {
		return "user data";
	}

	
	@GetMapping("/studentData")
	public String getStudentData() {
		return "user data";
	}
}
