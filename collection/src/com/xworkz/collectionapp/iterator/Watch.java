package com.xworkz.collectionapp.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		
		String str1 = "Fastrack";
		String str2 = "Apple";
		String str3 = "Timex";
		String str4 = "Titoni";
		String str5 = "Rado";
		
		Collection<String> ref = new ArrayList<String>();
		ref.add(str5);
		ref.add(str4);
		ref.add(str3);
		ref.add(str2);
		ref.add(str1);
		
		System.out.println("*****Iterator****");
		Iterator<String> reff = ref.iterator();
		for(String elment :ref) {
			System.out.println(elment);
		}
	
		System.out.println("To access the element");
		while(reff.hasNext()) {
			String value = reff.next();
			System.out.println(value);
		}
		
		

	}

}
