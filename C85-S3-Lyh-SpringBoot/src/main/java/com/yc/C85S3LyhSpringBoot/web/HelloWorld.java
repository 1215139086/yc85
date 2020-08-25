package com.yc.C85S3LyhSpringBoot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("hello")
	public String hello() {
		return "HelloWorld";
	}
	
}
