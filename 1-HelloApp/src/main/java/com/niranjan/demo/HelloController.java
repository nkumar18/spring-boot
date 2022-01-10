package com.niranjan.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@RequestMapping("/hello")
	public String handleHelloRequest() {
		
		return "hello spring boot";
	}

}
