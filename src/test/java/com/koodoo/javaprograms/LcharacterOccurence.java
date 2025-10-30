package com.koodoo.javaprograms;

public class LcharacterOccurence {

	public static void main(String[] args) {
		String str = "india iiiis great";
		int count=0;
		
		for(char ch: str.toCharArray())
		{
			if(ch=='i') {
				count++;
			}
		}
		System.out.println("Occurance count: "+count);
	}

}
