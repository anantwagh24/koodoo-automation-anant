package com.koodoo.javaprograms;

import java.util.ArrayList;

public class Slistexample {

	public static void main(String[] args) {

		//When to use: ➡️ When you need to store items in order, and duplicates are okay.

		ArrayList<String> groceries=new ArrayList<>();
		groceries.add("Mango");
		groceries.add("Chikoo");
		groceries.add("Apple");
		groceries.add("Honey");
		groceries.add("Gold");
		
		
		System.out.println(groceries.clone());
		System.out.println(groceries.indexOf("Gold"));
		System.out.println(groceries.toArray());
		System.out.println("Groceries size list: "+groceries.size());
		System.out.println("Groceries are: "+groceries);
		System.out.println("1st Groceries : "+groceries.get(0));
		System.out.println("3rd Groceries : "+groceries.get(2));
		groceries.clear();

	}

}
