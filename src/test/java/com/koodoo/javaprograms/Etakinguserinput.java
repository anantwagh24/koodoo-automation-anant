package com.koodoo.javaprograms;

import java.util.Scanner;

import org.openqa.selenium.devtools.v138.input.Input;

public class Etakinguserinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name: ");
		String str = sc.nextLine();
		System.out.println("your name is: "+str);				
	}

}
