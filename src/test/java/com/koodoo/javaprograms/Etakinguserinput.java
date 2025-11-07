package com.koodoo.javaprograms;

import java.util.Scanner;

import org.openqa.selenium.devtools.v138.input.Input;

public class Etakinguserinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your STRING input: ");
		String s1 = sc.nextLine();
		System.out.println("your string input is: " + s1);
		System.out.println("enter your NUMERIC input: ");
		int n1 = sc.nextInt();
		System.out.println("your number input is: " + n1);

	}

}
