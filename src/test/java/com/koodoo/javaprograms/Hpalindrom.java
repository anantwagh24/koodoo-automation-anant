package com.koodoo.javaprograms;

public class Hpalindrom {

	public static void main(String[] args) {

		int r, sum=0, temp, n=151;

		temp=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}



