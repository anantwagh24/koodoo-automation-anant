package com.koodoo.javaprograms;

import java.util.Scanner;

public class zzFindLargestNumberAmongThree {

	public static void main(String[] args) {
		// /********* FIND USING AN ARRAY *********/
		// int a[]= {4,5,6,7,78};
		// int max=a[0];
		//
		// for(int i=0;i<a.length;i++) {
		// if(a[i]>max) {
		// max=a[i];
		// }
		// }
		// System.out.println("larget number is: "+max);

		/********* FIND USING AN USER INPUT *********/
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your number: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		System.out.println("your numbers are : " + n1 + " and " + n2 + " and " + n3);

		int greatest;

		if (n1 >= n2 && n1 >= n3) {
			greatest = n1;

		} else if (n2 >= n1 && n2 >= n3) {
			greatest = n2;

		} else {
			greatest = n3;

		}

		System.out.println("greatest number is: " + greatest);

	}

}
