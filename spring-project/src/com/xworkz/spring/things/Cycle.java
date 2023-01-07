package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Cycle {
	
	public Cycle() {
		System.out.println("Cycle object is created");
	}
   
	@Override
	public String toString() {
		return "Cycle is cycle";
	}
}
