package com.xworkz.collectionapp.streams;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collectionapp.dto.CompanyCeoDTO;
import com.xworkz.collectionapp.dto.DaughterDTO;

public class CompanyCeoTester {

	public static void main(String[] args) {

		Collection<CompanyCeoDTO> companyceo = new LinkedList<CompanyCeoDTO>();
		companyceo.add(new CompanyCeoDTO("Ashneer Grover", "Bharath Pay", 52, "Indian", "Graduate", true,
				(new DaughterDTO("Sangeetha", 9685748589L, 23, true, true))));
		companyceo.add(new CompanyCeoDTO("Aman Gupta", "boAt", 46, "Indian", "B.Com", true,
				(new DaughterDTO("Anusha", 8596748596L, 21, false, true))));
		companyceo.add(new CompanyCeoDTO("Mark Zukaerberg", "Instagram", 56, "American", "Graduate", true,
				(new DaughterDTO("Jennifier", 7485968574L, 23, true, true))));

		companyceo.stream().map(ele -> ele.getDughter().getName()).collect(Collectors.toList())
				.forEach(data -> System.out.println(data));

		companyceo.stream().forEach(ele -> System.out
				.println("Ceo Age " + ele.getAge() + " " + "Doughter age " + ele.getDughter().getAge()));

	}

}
