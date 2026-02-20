package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HElloController {
@GetMapping("/hello")
	   public String syaHello()
	   {
		   return "I am good girl";
	   }
	   
	
}
