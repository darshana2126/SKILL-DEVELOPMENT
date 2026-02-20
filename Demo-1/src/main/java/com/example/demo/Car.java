package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class Car {
public Engine engine;

public Car(Engine engine) {
	this.engine=engine;
}
	public String drive() {
		return engine.start();
	}
}