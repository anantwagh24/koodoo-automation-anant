package com.koodoo.javaprograms;

public class Pprintvowelsoccurances {

	public static void main(String[] args) {
		String str = "Anant iis extraordinary human beiing";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u') {
				count++;
			}

		}
		System.out.println("occurence of vowels: " + count);
	}

}
