package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Application {
  
	public Application() {
		System.out.println("Application object is created");
	}
	
	@Override
	public String toString() {
		
		return "Developer develop the application";
	}
}
