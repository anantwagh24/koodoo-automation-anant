package com.koodoo.javaprograms;

import java.util.HashMap;
import java.util.Iterator;

public class Uhashmap {

	public static void main(String[] args) {
		//When to use: ➡️ When you need key-value pairs (like “name → phone”, “roll → marks”).
		
		HashMap<String, String> hm=new HashMap<>();
		
		hm.put("anant", "1234");
		hm.put("rahul", "345");
		hm.put("sachin", "4959");
		
		System.out.println(hm);
		System.out.println(hm.get("anant"));
		System.out.println(hm.hashCode());
		System.out.println(hm.get(1));
		
		
    
	}

}

 
