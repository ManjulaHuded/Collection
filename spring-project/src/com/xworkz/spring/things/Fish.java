package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Fish {
  
	public Fish() {
		System.out.println("The object is created for fish");
	}
	
	@Override
	public String toString() {
		
		return "fishes are looks good";
	}
}
