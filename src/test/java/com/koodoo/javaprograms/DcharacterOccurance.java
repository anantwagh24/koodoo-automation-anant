package com.koodoo.javaprograms;

public class DcharacterOccurance {

	public static void main(String[] args) {
		String string = "ICIICICICIICICICIIVIVIIDIDIDIFIIBIIIWIEIEIEIIFIVIIIIDIDIDIIDIIDID";
		char ch='I';
		int count=0;
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==ch) {
				count++;
				
			}
		}
		System.out.println("Occurence of character '"+ch+"' is: "+count+"  times");

	}

}


