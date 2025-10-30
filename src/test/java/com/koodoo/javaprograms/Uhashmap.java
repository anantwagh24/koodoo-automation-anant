package com.koodoo.javaprograms;

import java.util.HashMap;
import java.util.Iterator;

public class Uhashmap {

	public static void main(String[] args) {
		//When to use: ➡️ When you need key-value pairs (like “name → phone”, “roll → marks”).
		
		HashMap<String, String> contacts = new HashMap<>();
		contacts.put("John", "9876543210");
		contacts.put("Sara", "9123456789");
		contacts.put("Mike", "9876543210"); // duplicate value ok, unique key

        System.out.println("Phone Directory: " + contacts);
        System.out.println("Sara's number: " + contacts.get("Sara"));
    
	}

}

