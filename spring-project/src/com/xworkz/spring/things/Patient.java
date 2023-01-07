package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	
	public Patient() {
		System.out.println("The object is created for patient");
	}
	
	@Override
	public String toString() {
		return "Patient is taking treatment";
	}

}
