package com.koodoo.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class xWordCount{
	public static void main(String[] args) {

		String text = "Fear leads to anger; anger leads to hatred; hatred leads to conflict";

		// Convert to lowercase
		text = text.toLowerCase();

		// Remove punctuation
		text = text.replace(";", "");

		// Split the text into words
		String[] words = text.split(" ");

		// Create an array to store counts
		for (int i = 0; i < words.length; i++) {
			int count = 1;
			if (words[i].equals("0")) // skip already counted words
				continue;

			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0"; // mark as counted
				}
			}

			if (!words[i].equals("0"))
				System.out.println(words[i] + " : " + count);
		}

	}
}