package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Milk {

	 public Milk() {
		System.out.println("The object is created for milk");
	}
	 @Override
	public String toString() {
		return "Milk is good for health";
	}
}
