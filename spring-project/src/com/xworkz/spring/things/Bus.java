package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	
	public Bus() {
		System.out.println("The bus object is created");
	}
	
	@Override
	public String toString() {
		return "Bus is helps to travel for people ";
	}

}
