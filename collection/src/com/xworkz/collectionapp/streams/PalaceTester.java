package com.xworkz.collectionapp.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PalaceTester {

	public static void main(String[] args) {
		
		Collection<PalaceDTO> palace = new ArrayList<PalaceDTO>();
		palace.add(new PalaceDTO("Mysore", "Mysuru", "Krishnaraj Wadeyar 4", false, 500.0));
		palace.add(new PalaceDTO("Banglore", "Bengaluru", "Chamaraj Wadeyar", true, 400.00));
		palace.add(new PalaceDTO("Lalith Mahal", "Mysuru", "Krishnaraj Wadeyar 4", false, 500.0));
		palace.add(new PalaceDTO("Jaganmohan Palace", "Mysuru", "Mummadi Krishnaraja Wadeyar", true, 500.0));
		
		
		palace.stream().filter(ele->ele.isDestroyed())
		.collect(Collectors.toSet()).forEach(data->System.out.println(data));

	}

}
