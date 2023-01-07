package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Park {
  
	public Park() {
		System.out.println("Park object is created");
	}
	
	@Override
	public String toString() {
		
		return "Park is good place";
	}
}
