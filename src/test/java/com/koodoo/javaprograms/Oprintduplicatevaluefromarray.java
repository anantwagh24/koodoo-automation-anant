package com.koodoo.javaprograms;

public class Oprintduplicatevaluefromarray {

	public static void main(String[] args) {
		String str[]= {"a","b","c","d","e","a","b"};
		
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.println("duplicate value is: "+str[j]);
				}
			}
		}
	}

}
