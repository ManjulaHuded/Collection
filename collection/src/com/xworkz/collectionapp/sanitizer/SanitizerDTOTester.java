package com.xworkz.collectionapp.sanitizer;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class SanitizerDTOTester {

	public static void main(String[] args) {
		
		SanitizerDTO sanitizerDTO1 = new SanitizerDTO(201, 8, "Dettol", "Green");
		SanitizerDTO sanitizerDTO2 = new SanitizerDTO(202, 5, "Lifebuoy", "Red");
		SanitizerDTO sanitizerDTO3 = new SanitizerDTO(203, 15, "Savlon", "Blue");
		SanitizerDTO sanitizerDTO4 = new SanitizerDTO(204, 20, "Purehands", "Green");

		SanitizerDTO sanitizerDTO5 = new SanitizerDTO(205, 10, "Purell", "White");
		SanitizerDTO sanitizerDTO6 = new SanitizerDTO(206, 20, "Sterlomax", "Blue");
		SanitizerDTO sanitizerDTO7 = new SanitizerDTO(207, 15, "Palmolive", "Red");

		SanitizerDTO sanitizerDTO8 = new SanitizerDTO(208,25, "Mediker", "Green");
		SanitizerDTO sanitizerDTO9 = new SanitizerDTO(209, 15, "Himalaya", "Red");
		SanitizerDTO sanitizerDTO10 = new SanitizerDTO(210, 5, "Dabur", "Pink");
		
		Collection<SanitizerDTO> sanitizerDTOs = new LinkedList<SanitizerDTO>();
		sanitizerDTOs.add(sanitizerDTO10);
		sanitizerDTOs.add(sanitizerDTO9);
		sanitizerDTOs.add(sanitizerDTO8);
		sanitizerDTOs.add(sanitizerDTO7);
		sanitizerDTOs.add(sanitizerDTO6);
		sanitizerDTOs.add(sanitizerDTO5);
		sanitizerDTOs.add(sanitizerDTO4);
		sanitizerDTOs.add(sanitizerDTO3);
		sanitizerDTOs.add(sanitizerDTO2);
		sanitizerDTOs.add(sanitizerDTO1);
		
		Iterator<SanitizerDTO> ref = sanitizerDTOs.iterator();
		while(ref.hasNext()) {
			SanitizerDTO element = ref.next();
			//System.out.println(element.getPrice());
			if(element.getPrice()>5) {
				System.out.println("Less than 5 price print all " + element.getPrice());
				
			}
		}
		

	}

}
