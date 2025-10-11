package com.koodoo.javaprograms;

import java.util.HashSet;

public class Tsetexample {

	public static void main(String[] args) {
		//When to use: ➡️ When you want only unique entries and don’t care about order.
		
		 HashSet<String> passportNumbers = new HashSet<>();
	        passportNumbers.add("P1234");
	        passportNumbers.add("P5678");
	        passportNumbers.add("P1234"); // duplicate ignored
	        
	        System.out.println("Unique passports: " + passportNumbers);
	}
}
