package com.koodoo.javaprograms;

public class Mprimenumber {




	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int number = 7;
		if (isPrimeNumber(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}
