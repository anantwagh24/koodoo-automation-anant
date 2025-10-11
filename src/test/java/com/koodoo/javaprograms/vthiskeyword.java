package com.koodoo.javaprograms;

public class vthiskeyword {
	
	int a=4;

	public void abc() {
		int a=2;
		
		System.out.println("print: "+a);
		System.out.println("print: "+this.a);
	}

	public static void main(String[] args) {
		vthiskeyword ab=new vthiskeyword();
		ab.abc();

	}

}
