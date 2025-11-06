package com.koodoo.javaprograms;

import java.util.Scanner;

public class Gswappingusinguserinput {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number");
		a=sc.nextInt();
		System.out.println("first number is: "+a);
		System.out.println("enter your 2nd number: ");
		b=sc.nextInt();
		System.out.println(" your 2nd number is: "+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("Swapped inputs are: "+a+" and "+b);
		
	}

}

