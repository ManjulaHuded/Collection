package com.xworkz.collectionapp.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collectionapp.dto.DaughterDTO;

public class DaughterTester {

	public static void main(String[] args) {
		
		Collection<DaughterDTO> daughter = new ArrayList<DaughterDTO>();
		daughter.add(new DaughterDTO("Shruti", 85962714l, 23, false, true));
		daughter.add(new DaughterDTO("Navaneetha", 856249347l, 22, false, true));
		daughter.add(new DaughterDTO("Laxmi", 952674329l, 22, true, true));
		daughter.add(new DaughterDTO("Anand", 98557862l, 23, true, true));
		daughter.add(new DaughterDTO("Muddanna", 827563948l, 24, false, true));
		
		
		

	}

}
