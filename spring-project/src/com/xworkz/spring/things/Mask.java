package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Mask {
  
	public Mask() {
		System.out.println("The mask object is created");
	}
	
	@Override
	public String toString() {
		return "Mask is protected form virus";
	}
}
