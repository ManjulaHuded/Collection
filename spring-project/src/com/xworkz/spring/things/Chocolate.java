package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Chocolate {
  
	public Chocolate() {
		System.out.println("The object is created for chocolate");
	}
	
	@Override
	public String toString() {
		return "Chocolates are so tasty";
	}
}
