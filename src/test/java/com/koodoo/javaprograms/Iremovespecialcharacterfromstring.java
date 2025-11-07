package com.koodoo.javaprograms;

public class Iremovespecialcharacterfromstring {

	public static void main(String[] args) {
		String s1 = "A!N@A#N$T%W&A&G*H";
		String s2 = " ";

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) > 64 && s1.charAt(i) < 122) {
				s2 = s2 + " " + s1.charAt(i);
			}
		}
		System.out.println("pure string is :" + s2);
	}

}