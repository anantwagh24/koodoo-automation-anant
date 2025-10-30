package com.koodoo.javaprograms;

public class Iremovespecialcharacterfromstring {

	public static void main(String[] args) {
		String str = "A!N@A#NT$ W%AG&H*()";
		String str2 = "";
		System.out.println("String with special characters: "+str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>64 && str.charAt(i)<122) {
				str2 = str2 + str.charAt(i);
			}
		}
		System.out.println("a clean string is: "+str2);
	}

}
