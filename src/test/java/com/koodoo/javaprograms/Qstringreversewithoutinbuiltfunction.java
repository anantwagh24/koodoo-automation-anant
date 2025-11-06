package com.koodoo.javaprograms;

public class Qstringreversewithoutinbuiltfunction {

	public static void main(String[] args) {

		String str="ANANT WAGH";
		for(int i=str.length();i>0;i--) {
			System.out.print(str.charAt(i-1));
		}
	}

}