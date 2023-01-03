package com.xworkz.collectionapp.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.xworkz.collectionapp.dto.ApplicationDTO;

public class ApplicationTester {

	public static void main(String[] args) {

		Collection<ApplicationDTO> application = new ArrayList<ApplicationDTO>();
		application.add(new ApplicationDTO("Olx", 1.2, true, "Prosus", 0));
		application.add(new ApplicationDTO("Hotstar", 2.5, false, "Hotstar", 200));
		application.add(new ApplicationDTO("Chrome", 8.1, true, "Google", 0));
		application.add(new ApplicationDTO("Java", 15, true, "Sun Microsystems", 0));
		application.add(new ApplicationDTO("LinkedIn", 1.3, true, "LinkedIn", 0));

		application.stream().filter(ele -> ele.isFree() && ele.getDevelopedBy().equals("Google"))
				.collect(Collectors.toSet()).forEach(data -> System.out.println(data));

		System.out.println("*****************************");

		application.stream().filter(ele -> ele.getVersion() > 5).collect(Collectors.toSet())
				.forEach(data -> System.out.println(data));
System.out.println("=====");
		System.out.println("sorting comparator");
		System.out.println("***");
		Comparator<ApplicationDTO> comparator = (p1, p2) -> Double.compare(p2.getVersion(), p1.getVersion());
		application.stream().sorted(comparator).forEach(ele -> System.out.println(ele));
System.out.println("****");		
		application.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName()))
		.forEach(dto->System.out.println(dto));
	}
}
