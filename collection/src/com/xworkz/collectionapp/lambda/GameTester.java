package com.xworkz.collectionapp.lambda;

public class GameTester {

	public static void main(String[] args) {
		
		Games ref = (a1,a2)->{
			System.out.println("Running lambda");
			System.out.println("Sttring "+ a1);
			System.out.println("id "+ a2);
		};
		ref.type("Kabaddi", 12);
		
	}
}
