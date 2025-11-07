package com.koodoo.javaprograms;

import java.util.Scanner;

public class Gswappingusinguserinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your 1st number: ");
		int a = sc.nextInt();
		System.out.println("your 1st number is: " + a);
		System.out.println("enter your 2nd number : ");
		int b = sc.nextInt();
		System.out.println("your 2nd number is: " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("numbers after swap are: "+a+" and "+b);

	}

}
