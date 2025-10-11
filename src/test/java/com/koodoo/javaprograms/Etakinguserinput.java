package com.koodoo.javaprograms;

import java.util.Scanner;

public class Etakinguserinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		System.out.println("your string is: "+str);
	}

}
