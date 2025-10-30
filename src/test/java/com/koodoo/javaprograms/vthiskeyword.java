package com.koodoo.javaprograms;

public class vthiskeyword {

	int a =4;
	
	public void abc() {
		System.out.println("Print value of a of method abc: "+a);
		System.out.println("Print class level value of a: "+this.a);

	}
	
	public static void main(String[] arg) {
		vthiskeyword ab=new vthiskeyword();
		ab.abc();
		
	}

}
