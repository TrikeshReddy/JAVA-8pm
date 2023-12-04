package com.constructor;

public class ConstructorExample {
	int i;
	String name;
	public ConstructorExample(int i,String name) {
		this(i);
		this.name=name;
		System.out.println("6 called");
	}
	public ConstructorExample(int i) {
		
		System.out.println("10 called");
	}
	public ConstructorExample() {
		System.out.println("14 called");	
	}
	

}
