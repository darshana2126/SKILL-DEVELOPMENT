package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Carcontroller {

	private Car car;
	public Carcontroller(Car car){
		this.car=car;
	}
	@GetMapping("/car")
	public String driveCar() {
		return car.drive();
	}
}
