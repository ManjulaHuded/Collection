package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Road  {

	public Road() {
		System.out.println("Road object is created");
	}
	
	@Override
	public String toString() {
		return "Road is a road";
	}
}
