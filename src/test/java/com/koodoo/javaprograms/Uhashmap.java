package com.koodoo.javaprograms;

import java.util.HashMap;
import java.util.Iterator;

public class Uhashmap {

	public static void main(String[] args) {
		//When to use: ➡️ When you need key-value pairs (like “name → phone”, “roll → marks”).
		
		HashMap<Object, Object> hm=new HashMap<>(); // TO ADD BOTH VALUES AS MIX OF STRING AND INT
		//HashMap<String ,String > hm=new HashMap<>(); To add Both key value as STRINGS
		//HashMap<Integer, Integer> hm=new HashMap<>(); To add Both key value as INTEGER
		
		hm.put("name", "anant");
		hm.put("age", 32);
		hm.put("experience", 9);
		
		System.out.println(hm);
		System.out.println(hm.get("anant"));
		System.out.println(hm.hashCode());
		System.out.println(hm.get(1));
	
	}

}

 
