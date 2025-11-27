package com.koodoo.javaprograms;

import java.util.Scanner;

public class DcharacterOccurance {

	public static void main(String[] args) {
		
		String str = "IISISISIISISIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIAISIAISIDIDIFIVIVIGIIIIIGIGIGIIGIIIIIIIIIIIIIIIIIII";
		char ch = 'I';
		int count = 0;


		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("occurance of character " + ch + " is " + count + "  time");

	}

}