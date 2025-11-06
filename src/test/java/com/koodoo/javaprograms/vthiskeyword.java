package com.koodoo.javaprograms;

public class vthiskeyword {

	int a=4;

	public void abc() {
		int a=5;
		System.out.println("value of a of method abc: "+a);
		System.out.println("Value of a declared at the class level: "+this.a);
	}

	public static void main(String[] args) {
		vthiskeyword vtk= new vthiskeyword();
		vtk.abc();
	}

}