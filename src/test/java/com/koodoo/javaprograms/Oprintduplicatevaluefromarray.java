package com.koodoo.javaprograms;

public class Oprintduplicatevaluefromarray {

	public static void main(String[] args) {
		String str[]= {"java","python","java","golang","c#"};
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j])) {
					System.out.println("duplicate value is:"+str[i]);			
				}
			}
		}
	}

}
