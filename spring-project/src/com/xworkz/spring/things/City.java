package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class City {

	public City() {
		System.out.println("The city object is created");

	}

	@Override
	public String toString() {

		return "The city is under developing";
	}
}
