package com.koodoo.javaprograms;

public class WsuperKeywordChildClass extends WsuperKeywordParentClass  {

	public void getData() {
		String name = "Rahul";
		System.out.println("Print string name of child class: "+name);
		System.out.println("Print string name of child class: "+super.name); // Example of SUPER keyword

	} 

	// Below method is the example of METHOD OVERRIDING :
	@Override
	public void methoOverriding() {
		int a=5;
		System.out.println("value of a is: "+a);
	}

	public static void main(String[] arg) {
		WsuperKeywordChildClass abc=new WsuperKeywordChildClass();
		abc.getData();
		abc.methoOverriding();

	}

}
