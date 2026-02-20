package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Car {
public Engine engine;

@Autowired
public void SetEngine(Engine engine) {
	this.engine =engine;
}
	public String drive() {
		return engine.start();
	}
}