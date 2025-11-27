package com.koodoo.javaprograms;

import java.util.Scanner;

public class Fswappingnumbers {

	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("numbers before swap: "+a+" and "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("numbers after swap: "+a+" and "+b);
				
				
	}
}