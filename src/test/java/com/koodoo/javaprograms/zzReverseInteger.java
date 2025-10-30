package com.koodoo.javaprograms;

import java.util.Scanner;

public class zzReverseInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int reversed = 0;
        
        while(number !=0) {
        int digit= number%10;
        reversed = reversed * 10 + digit;
        number /= 10;         
        }
        System.out.println("Reversed number: " + reversed);
        sc.close();

	}

}
