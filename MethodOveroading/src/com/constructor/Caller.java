package com.constructor;

public class Caller {
	public static void main(String[] args) {
		
		//without constructor		
		  ConstructorExample constructorExample =new ConstructorExample();
		  constructorExample.i =90; 
		  constructorExample.name="trikesh"; 	  
		//with constructor	  
		ConstructorExample constructorExample2=new ConstructorExample(10,"trikesh");
		System.out.println(constructorExample2.i);
		System.out.println(constructorExample2.name);
		
		ConstructorExample constructorExample3=new ConstructorExample(10);
		System.out.println(constructorExample3.i);
		System.out.println(constructorExample3.name);
		
		ConstructorExample constructorExample4= new ConstructorExample();
		System.out.println(constructorExample4.i);
	}
}
