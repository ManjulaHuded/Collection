package com.xworkz.collectionapp.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {
      
	public static void main(String[] args) {
		
		int size1 = 12;
		int size2 = 13;
		int size3 = 14;
		int size4 = 2;
		int size5 = 3;
		int size6 = 4;
		int size7 = 22;
		int size8 = 33;
		int size9 = 42;
		int size10 = 82;
		int size11 = 93;
		int size12 = 84;
		int size13 = 22;
		int size14 = 37;
		int size15 = 40;
		
		Collection<Integer> ref = new ArrayList<Integer>();
		ref.add(size1);
		ref.add(size2);
		ref.add(size3);
		ref.add(size4);
		ref.add(size5);
		ref.add(size6);
		ref.add(size7);
		ref.add(size8);
		ref.add(size9);
		ref.add(size10);
		ref.add(size11);
		ref.add(size12);
		ref.add(size13);
		ref.add(size14);
		ref.add(size15);
		
		System.out.println("*****Iterator****");
		Iterator<Integer> reff = ref.iterator();
	    for(int elment:ref) {
	    	System.out.println(elment);
	    }	
	    System.out.println("To access the element");   
	    while(reff.hasNext()) {
	    	 int value = reff.next();
	    	 System.out.println(value);
	    }
	}
}
