package com.koodoo.javaprograms;

public class vthiskeyword {

	int a = 6;

	public void abc() {
		int a = 5;
		System.out.println("value of local variable 'a' is: " + a);
		System.out.println("value of global variable 'a' is: " + this.a);

	}

	public static void main(String[] args) {

		vthiskeyword vtk = new vthiskeyword();
		vtk.abc();
	}
}
