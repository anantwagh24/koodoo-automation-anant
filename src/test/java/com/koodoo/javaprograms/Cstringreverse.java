package com.koodoo.javaprograms;

public class Cstringreverse {

	public static void main(String[] args) {
		String s1="Anant";
		
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb.reverse();
		System.out.println("Reversed string is: "+sb);
		sb.reverse();
		System.out.println("Re - Reversed string is: "+sb);

	}

}
