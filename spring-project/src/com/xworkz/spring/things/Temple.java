package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Temple {
  
	public Temple() {
		System.out.println("The object is created for temple");
	}
	
	@Override
	public String toString() {

		return "temple is peacefull place";
	}
}
