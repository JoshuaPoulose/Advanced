package com.hello.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class Service {
	
	@Autowired
	Environment environment;
	
	
	@Value("name")
	String strMessage;
	
	@GetMapping
	public String Welcome() {
		String port=environment.getProperty("server.port");
		return "Programming Microservices@ "+port;
	}
	
	@GetMapping("/status")
	public String status() {
		return "upcoming and running";
	}
}
