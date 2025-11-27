package com.koodoo.javaprograms;

public class zzFrom1To100CalculateSum {

	public static void main(String[] args) {
		
		int sum=0, start=0, end=100;
		
		for(int i=start; i<=end;i++) {
			sum+=i;
		}
		
		System.out.println("your sum is: "+sum);
		
		double average= (double) sum/end;
		
		System.out.println("average is: "+average);
	}

}
