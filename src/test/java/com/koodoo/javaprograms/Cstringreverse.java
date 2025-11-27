package com.koodoo.javaprograms;

import java.util.Scanner;

public class Cstringreverse {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your string: ");
		String s1=sc.nextLine();
		System.out.println("your string is: "+s1);
		sb.append(s1);
		sb.reverse();
		
		System.out.println("reversed string is: "+sb);
		
	}

}