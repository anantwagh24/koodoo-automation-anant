package com.koodoo.javaprograms;

import java.util.Scanner;

public class Pprintvowelsoccurances {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your string: ");
		String str=sc.nextLine();
		System.out.println("your string is: "+str);

		int count=0;

		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
				count++;
			}
		}
		System.out.println("count of vowels: "+count);

	}

}