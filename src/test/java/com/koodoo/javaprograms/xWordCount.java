package com.koodoo.javaprograms;

import java.util.Scanner;

public class xWordCount {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str=sc.nextLine();

		System.out.println("Enter your word:");
		String wrd=sc.nextLine();

		str=str.toLowerCase();
		wrd=wrd.toLowerCase();

		String arr[]=str.split(" ");

		int count=0;

		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(wrd)) {
				count++;
			}
		}
		System.out.println("count of word is: "+count);

	}
}