package com.koodoo.javaprograms;

public class zzFrom1To100CalculateSum {

	public static void main(String[] args) {
		
		int sum=0;
		int start=0;
		int end=100;
		
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		
		double average= (double) sum/end;

		System.out.println("Sum of numbers from " + start + " to " + end + " is: " + sum);
        System.out.println("Average of numbers from " + start + " to " + end + " is: " + average);
   
	}

}
