package com.xworkz.collectionapp.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Software {

	public static void main(String[] args) {
		
		String str1 = "HP";
		String str2 = "Dell";
		String str3 = "Oracle";
		String str4 = "Square";
		String str5 = "Intelliware";
		String str6 = "Microsoft";
		String str7 = "Accenture";
		String str8 = "Wipro";
		String str9 = "Nokia";
		String str10 = "Infotech";
		String str11 = "HTMT";
		String str12 = "HSBC";
		String str13 = "Honeywell";
		String str14 = "Infosys";
		String str15 = "Google";
		String str16 = "Deloitte";
		String str17 = "Capmark";
		String str18 = "IBM";
		String str19 = "Cadence";
		String str20 = "Patni";
		
		Collection<String> ref = new ArrayList<String>();
		ref.add(str20);
		ref.add(str19);
		ref.add(str18);
		ref.add(str17);
		ref.add(str16);
		ref.add(str15);
		ref.add(str14);
		ref.add(str13);
		ref.add(str12);
		ref.add(str11);
		ref.add(str10);
		ref.add(str9);
		ref.add(str8);
		ref.add(str7);
		ref.add(str6);
		ref.add(str5);
		ref.add(str4);
		ref.add(str3);
		ref.add(str2);
		ref.add(str1);
		
		System.out.println("*****Iterator****");
		Iterator<String> reff = ref.iterator();
		for (String string : ref) {
			System.out.println(string);
		}
		
		System.out.println("To access the element");	
		while (reff.hasNext()) {
			String string = reff.next();
			System.out.println(string);
		}

	}

}
