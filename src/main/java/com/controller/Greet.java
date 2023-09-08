package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {

	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String get() {
		String port = env.getProperty("server.port");
		return "Welcome to Service-2 :: GREET :: PORT Number :: "+port;
	}
	
}
