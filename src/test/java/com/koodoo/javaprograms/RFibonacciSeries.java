package com.koodoo.javaprograms;

public class RFibonacciSeries {

	public static void main(String[] args) {
		int n=10, first=0, second=1;
		
		System.out.print("fibonacci series: ");
		
		for(int i=0;i<n;i++) {
			System.out.print(first+" ");
			
			int next=first+second;
			first=second;
			second=next;				
		}

	}
}
