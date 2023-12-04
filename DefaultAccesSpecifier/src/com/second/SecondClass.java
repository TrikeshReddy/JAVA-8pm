package com.second;

import com.first.FirstClass;
//default methods or variable cannot be accesible outside in outside package non sub classes
public class SecondClass {
	public static void main(String[] args) {
		FirstClass firstClass =new FirstClass();
		firstClass.nonStaticDefault();
		FirstClass.staticDefault();
		firstClass.staticDefault();
		System.out.println(firstClass.x);
		System.out.println(FirstClass.y);
	}
}