package com.xworkz.collectionapp.basic;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {
    public static void main(String[] args) {
    	
    	String bike1 = "TVS";
    	String bike2 = "Honda Shine";
    	String bike3 = "TVS Jupiter";
    	String bike4 = "Discover 110";
    	String bike5 = "Pulsar 220s";
    	String bike6 = "XCD 125";
    	String bike7 = "XCD 135";
    	String bike8 = "Platina 125 DTS-SI";
    	String bike9 = "Hero Splendor Ismart";
    	String bike10 = "Bajaj";
    	String bike11 = "Hero Splendor Pro";
    	String bike12 = "Avenger";
    	String bike13 = "Honda";
    	String bike14 = "Bajaj Auto";
    	String bike15 = "Activa";
    	String bike16 = "Hero Motocorp";
    	String bike17 = "Dream";
    	String bike18 = "Discover 100 m";
    	
		
    	Collection<String> ref = new TreeSet<String>();
    	ref.add(bike18);
    	ref.add(bike17);
    	ref.add(bike16);
    	ref.add(bike15);
    	ref.add(bike14);
    	ref.add(bike13);
    	ref.add(bike12);
    	ref.add(bike11);
    	ref.add(bike10);
    	ref.add(bike9);
    	ref.add(bike8);
    	ref.add(bike7);
    	ref.add(bike6);
    	ref.add(bike5);
    	ref.add(bike4);
    	ref.add(bike3);
    	ref.add(bike2);
    	ref.add(bike1);
    	
    	System.out.println(ref);
    	System.out.println(ref.size());
    	ref.clear();
    	
	}
}
