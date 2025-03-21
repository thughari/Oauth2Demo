package com.thughari.Oauth2Demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello from spring oauth2";
	}
	
}
