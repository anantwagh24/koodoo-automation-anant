package com.koodoo.javaprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zzReadFirstLineFromDocument {

	public static void main(String[] args)  {
		
		String filePath="/Users/anant.wagh/Documents/Test sample file.txt";
		
		try {
			BufferedReader br=new BufferedReader(new FileReader(filePath));
			
			String firstLine= br.readLine();
			
			if(firstLine!= null) {
				System.out.println("First line of the document is: ");
				System.out.println(firstLine);
			} else {
				System.out.println("Document is empty");
			}
			
		} catch (IOException e) {
			System.out.println("Document is empty");
			e.printStackTrace();
			
		} 

		
	}

}
