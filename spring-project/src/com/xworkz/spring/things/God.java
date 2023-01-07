package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class God {
  
	public God() {
		System.out.println("God object is created");
	}
	
	@Override
	public String toString() {
		
		return "God is great";
	}
}
