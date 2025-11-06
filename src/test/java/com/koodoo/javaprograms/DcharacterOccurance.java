package com.koodoo.javaprograms;

public class DcharacterOccurance {

	public static void main(String[] args) {
		String str = "ICIICICICIICICICIIVIVIIDIDIDIFIIBIIIWIEIEIEIIFIVIIIIDIDIDIIHIGIHIIDIIDID";
		char ch='I';
		int count=0;
		//str.toLowerCase();
		//str.toUpperCase();

		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Occurence of character '"+ch+"' is: "+count+"  times");

	}

}