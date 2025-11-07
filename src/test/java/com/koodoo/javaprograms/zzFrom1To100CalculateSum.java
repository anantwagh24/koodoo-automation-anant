package com.koodoo.javaprograms;

public class zzFrom1To100CalculateSum {

	public static void main(String[] args) {
		
		int sum=0, start=0, end=100;
		
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		
		double average= (double) sum/end;
		
		System.out.println("sum is: "+sum+" and average is: "+average);
   
	}

}
