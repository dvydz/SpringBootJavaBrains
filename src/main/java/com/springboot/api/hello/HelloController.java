package com.springboot.api.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi ! How are you ? Hope you FINE!";
	}
}
