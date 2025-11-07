package com.koodoo.javaprograms;

import java.util.ArrayList;

public class Slistexample {

	public static void main(String[] args) {

		// When to use: ➡️ When you need to store items in order, and duplicates are
		// okay.

		ArrayList<Object> al = new ArrayList<>();// TO ADD  VALUES AS MIX OF STRING AND INTEGER
		//ArrayList<String > hm=new ArrayList<>(); To add Both key value as STRINGS
		//ArrayList<Integer> hm=new ArrayList<>(); To add Both key value as INTEGER
		al.add("apple");
		al.add("berry");
		al.add("cherry");
		al.add("dragon fruit");
		al.add(123);
		al.add("fish");

		System.out.println(al);
		System.out.println(al.indexOf("cherry"));
		System.out.println(al.size());

		// System.out.println(groceries.clone());
		// System.out.println(groceries.indexOf("Gold"));
		// System.out.println(groceries.toArray());
		// System.out.println("Groceries size list: "+groceries.size());
		// System.out.println("Groceries are: "+groceries);
		// System.out.println("1st Groceries : "+groceries.get(0));
		// System.out.println("3rd Groceries : "+groceries.get(2));
		// groceries.clear();

	}

}
