package com.koodoo.javaprograms;

import java.util.Scanner;

public class Qstringreversewithoutinbuiltfunction {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your string: ");

		String str=sc.nextLine();
		
		for(int i=str.length();i>0;i--) {
			System.out.print(str.charAt(i-1));
		}
		

	}
}