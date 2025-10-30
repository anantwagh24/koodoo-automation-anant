package com.koodoo.javaprograms;

import java.util.Scanner;

public class zzEvenOddCheck {

	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter your number: ");
	   int num=sc.nextInt();
	   
	   if(num%2==0) {
		   System.out.println("Entered number is EVEN");
	   }
	   else {
		   System.out.println("Entered number is ODD");
	   }
	}

}
