package com.koodoo.javaprograms;

import java.util.Scanner;

public class yPrintnumbersInReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter your number: ");

		int num = sc.nextInt();

		for(int i=num;i>0;i--) {
			num-=1;
			System.out.println(num+1);
		}

	}
}

