package com.koodoo.javaprograms;

import java.util.Scanner;

public class Fswappingnumbers {

	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("number before swap: "+a+ " & "+b);
		
		a=a+b; 
		b=a-b;
		a=a-b;
		
		System.out.println("number after swap: "+a+ " & "+b);

		

	}

}
