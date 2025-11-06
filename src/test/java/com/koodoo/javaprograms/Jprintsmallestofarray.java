package com.koodoo.javaprograms;

public class Jprintsmallestofarray {

	public static void main(String[] args) {
		int a[]= {1,1,0,2,3,4,5,5,6};
		int min=a[0];

		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Smnallest array is: "+min);
	}

}