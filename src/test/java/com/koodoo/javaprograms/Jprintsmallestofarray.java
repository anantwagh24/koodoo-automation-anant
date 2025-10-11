package com.koodoo.javaprograms;

public class Jprintsmallestofarray {

	public static void main(String[] args) {
		int a[]= {2,3,4,1,67,8};
		int min = a[0];
		
		for(int i=0; i<a.length;i++) {
			if(a[i]<min) {
				min= a[i];
			}
		}
		System.out.println("smalles number from array is: "+min);
	}

}
