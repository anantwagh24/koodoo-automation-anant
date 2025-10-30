package com.koodoo.javaprograms;

public class Cstringreverse {

	public static void main(String[] args) {
		String s1="ANANT";
		System.out.println("Original string is: "+s1);
		StringBuilder s2= new StringBuilder();
		s2.append(s1);
		s2.reverse();
		System.out.println("Reversed string is: "+s2);
		s2.reverse();
		System.out.println("Re- Reversed string is: "+s2);


	}

}
