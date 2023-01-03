package com.xworkz.collectionapp.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {
    
	public static void main(String[] args) {
		
		String str1 = "Dog";
		String str2 = "Cat";
		String str3 = "Lion";
		String str4 = "Tiger";
		String str5 = "Elephant";
		String str6 = "Panda";
		String str7 = "Bear";
		String str8 = "Monkey";
		String str9 = "Rabbit";
		String str10 = "Snake";
		
		Collection<String> ref = new ArrayList<String>();
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
		
		
		System.out.println("*****Iterator****");//To access the elment
		Iterator<String> set = ref.iterator();
		for(String elment:ref) {
			System.out.println(elment);
		}
		System.out.println("To access the element");	
		while (set.hasNext()) {
			String string = set.next();
		System.out.println(string);	
		}
		
	}
}
