package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Girl {
  
	public Girl() {
		System.out.println("The object is created for girl");
	}
	
	@Override
	public String toString() {
		return "Girls are powerfull";
	}
}
