package com.koodoo.javaprograms;

import java.util.Scanner;

import org.openqa.selenium.devtools.v138.input.Input;

public class Etakinguserinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		String str=sc.nextLine();
		System.out.println("your string is: "+str);
		
		System.out.print("Enter your number:");
		int num=sc.nextInt();
		System.out.println("your number is: "+num);	
				
	}

}
