package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Area {
  
	public Area() {
		System.out.println("Area object is created");
	
	}
	
	@Override
	public String toString() {

		return "The area is used to some work";
	}
}
