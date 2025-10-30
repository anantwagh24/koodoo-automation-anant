package com.koodoo.javaprograms;

import java.util.Scanner;

public class Gswappingusinguserinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("Enter 1st number: ");
		a=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		
		System.out.println("Numbers after swap are: "+a+" and "+b);
		
	}

}

