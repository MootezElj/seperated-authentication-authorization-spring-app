package com.mootez.project.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("API/")
public class GreetingResource {
	
	@GetMapping("greeting/")
	public String getGreeting() {
		return "Hello dear !";
	}
	
	@GetMapping("admin/greeting/")
	public String getGreetingForAdmin() {
		return "Hello dear admin!";
	}

}
