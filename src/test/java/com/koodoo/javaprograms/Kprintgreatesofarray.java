package com.koodoo.javaprograms;

public class Kprintgreatesofarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,96,67,7,8};
		int max=a[0];
		
		for(int i=0; i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("greatest array is: "+max);
	}

}
