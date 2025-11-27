package com.koodoo.javaprograms;

public class Hpalindrom {

	public static void main(String[] args) {

		int r, sum=0, temp, num=252;

		temp=num;

		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;

		}
		if(sum==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}

