package com.koodoo.javaprograms;

public class Iremovespecialcharacterfromstring {

	public static void main(String[] args) {
		String str="!QW@#E$RT%Y&UI*(O)P";

		String s2=" ";

		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>64 && str.charAt(i)<122) {
				s2=s2+str.charAt(i);
			}
		
		}
		System.out.println("Clean string is: "+s2);	
	}

}
