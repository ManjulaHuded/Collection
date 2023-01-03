package com.xworkz.collectionapp.basic;

import java.util.Collection;
import java.util.TreeSet;

public class Sweet {
    
	public static void main(String[] args) {
		
		String sweet1 = "Kaju katli";
		String sweet2 = "Barfi";
		String sweet3 = "Gulab jamun";
		String sweet4 = "Imartti";
		String sweet5 = "Rasgulla";
		String sweet6 = "Rasmalai";
		String sweet7 = "Soan papdi";
		String sweet8 = "Modak";
		String sweet9 = "Rabri";
		String sweet10 = "Boondi";
		String sweet11 = "Shrikhand";
		String sweet12 = "Balusha";
		String sweet13 = "Malai Khaja";
		
		Collection<String> ref = new TreeSet<String>();
		ref.add(sweet1);
		ref.add(sweet10);
		ref.add(sweet11);
		ref.add(sweet12);
		ref.add(sweet13);
		ref.add(sweet2);
		ref.add(sweet3);
		ref.add(sweet4);
		ref.add(sweet5);
		ref.add(sweet6);
		ref.add(sweet7);
		ref.add(sweet8);
		ref.add(sweet9);
	
   System.out.println(ref);
   System.out.println(ref.size());
   ref.clear();
	}
}
