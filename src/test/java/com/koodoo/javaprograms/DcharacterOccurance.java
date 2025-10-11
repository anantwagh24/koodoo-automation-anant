package com.koodoo.javaprograms;

public class DcharacterOccurance {

	public static void main(String[] args) {
		String string = "ICICICICICICICIIICICICICICICI.COM";
		char letter = 'I';
		int count = 0;
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i) == letter)
				count++;
		}
		System.out.println("The occurance of letter '"+letter+"' is "+count+" times");

	}

}
