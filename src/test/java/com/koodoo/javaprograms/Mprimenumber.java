package com.koodoo.javaprograms;

import java.util.Scanner;

public class Mprimenumber {

	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}

		for(int i=2;i<num;i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your number: ");
		int number=sc.nextInt();

		if(isPrime(number)) 
			System.out.println(number+" is prime");
		else 
			System.out.println(number+" is not prime");

	}
}


