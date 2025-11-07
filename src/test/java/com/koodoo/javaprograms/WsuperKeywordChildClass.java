package com.koodoo.javaprograms;

public class WsuperKeywordChildClass extends WsuperKeywordParentClass  {
	
	public void getData() {
		String name = "Rahul";
		System.out.println("Print string name of child class: "+name);
		System.out.println("Print string name of child class: "+super.name);
		
	} 
	
	public static void main(String[] arg) {
		WsuperKeywordChildClass abc=new WsuperKeywordChildClass();
		abc.getData();
		
	}
	

}
