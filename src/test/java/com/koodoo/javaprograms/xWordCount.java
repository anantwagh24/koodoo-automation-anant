package com.koodoo.javaprograms;

public class xWordCount {

	public static void main(String[] args) {

		String str = "Java is fun and JAVA is powerful and java java java java java java java java java java is everywhere";
		String wrd="java";
		int count=0;
		
		str=str.toLowerCase();
		wrd=wrd.toLowerCase();
		
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(wrd)) {
				count++;
			}
			
		}
		System.out.println("count of word java is: "+count);
	}
}
