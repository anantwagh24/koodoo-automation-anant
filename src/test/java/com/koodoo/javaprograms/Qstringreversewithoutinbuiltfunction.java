package com.koodoo.javaprograms;

import java.util.Scanner;

public class Qstringreversewithoutinbuiltfunction {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter your input as string: ");
		String s1=sc.nextLine();
		System.out.println("YOUR string is: "+s1);
		
		int count=0;
		
		for(int i=s1.length();i>0;i--) {
			System.out.print(s1.charAt(i-1));
		}
		
	}

}