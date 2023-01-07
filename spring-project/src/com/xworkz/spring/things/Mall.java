package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Mall {
  
	public Mall() {
		System.out.println("The object is created for Mall");
	}
	
	@Override
	public String toString() {
		
		return "The most of people go for shoping";
	}
}
