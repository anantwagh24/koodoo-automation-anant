package com.koodoo.javaprograms;

import java.util.Scanner;

public class Mprimenumber {

	public static void main(String[] args) {

		int n = 101;

		boolean isPrime = true;

		if (n < 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime)
			System.out.println(n+" number is prime");
		else
			System.out.println(n+" number is not prime");
	}
}
