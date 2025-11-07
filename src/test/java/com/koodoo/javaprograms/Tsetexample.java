package com.koodoo.javaprograms;

import java.util.HashSet;

public class Tsetexample {

	public static void main(String[] args) {
		//When to use: ➡️ When you want only unique entries and don’t care about order.
		
		HashSet<Object> hs=new HashSet<>();// TO ADD  VALUES AS MIX OF STRING AND INTEGER
		//HashSet<String > hm=new HashSet<>(); To add Both key value as STRINGS
		//HashSet<Integer> hm=new HashSet<>(); To add Both key value as INTEGER
		
		hs.add("1");
		hs.add("2");
		hs.add("3");
		hs.add(4);
		
		System.out.println(hs);
		System.out.println(hs.clone());hs.clone();
		
		
	}
}