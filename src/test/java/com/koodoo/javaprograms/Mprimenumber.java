package com.koodoo.javaprograms;

import java.util.Scanner;

public class Mprimenumber {

	public static void main(String[] args) {

	//	int n=101;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		
		System.out.println("Entered number is: "+n);

		boolean isPrime=true;

		if (n<1){
			isPrime=false;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					isPrime= false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("Entered number is prime number");
		}
		else {
			System.out.println("entered number is not a prime number");
		}


	}
}


