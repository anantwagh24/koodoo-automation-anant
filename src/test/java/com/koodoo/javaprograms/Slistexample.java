package com.koodoo.javaprograms;

import java.util.ArrayList;

public class Slistexample {

	public static void main(String[] args) {
		
		//When to use: ➡️ When you need to store items in order, and duplicates are okay.
		
		ArrayList<String> groceries= new ArrayList<>();
		groceries.add("Apple");
		groceries.add("Bread");
		groceries.add("Cucumber");
		groceries.add("Carrot");
		groceries.add("Dal");
		groceries.add("Franky");
			
		System.out.println("Groceries are: "+groceries);
		System.out.println("1st Groceries : "+groceries.get(0));
		System.out.println("3rd Groceries : "+groceries.get(2));

	}

}
