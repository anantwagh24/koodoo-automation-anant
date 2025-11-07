package com.koodoo.javaprograms;

import java.util.Scanner;

public class Fswappingnumbers {

	public static void main(String[] args) {
		int a = 20, b = 40;

		System.out.println("Numeric input BEFORE swap are: " + a + " and " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Numeric input AFTER swap are: " + a + " and " + b);

	}
}