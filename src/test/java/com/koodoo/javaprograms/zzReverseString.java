package com.koodoo.javaprograms;

import java.util.Scanner;

public class zzReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter your string: ");

		String str = sc.nextLine();

		System.out.println("your string is: " + str);

		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.charAt(i - 1));

		}

	}

}
