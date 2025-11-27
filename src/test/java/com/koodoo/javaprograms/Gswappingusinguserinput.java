package com.koodoo.javaprograms;

import java.util.Scanner;

public class Gswappingusinguserinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your number: ");
		int n1=sc.nextInt();
		System.out.println("your number is: "+n1);
		
		
		System.out.println("enter your another number: ");
		int n2=sc.nextInt();
		System.out.println("your number is: "+n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("numbers after swap are: "+n1+" and "+n2);



	}

}
