package com.first;

public class SamePackSubClass extends FirstClass{
	public static void main(String[] args) {
		FirstClass firstClass =new FirstClass();
		firstClass.nonStaticDefault();
		FirstClass.staticDefault();
		firstClass.staticDefault();
		System.out.println(firstClass.x);
		System.out.println(FirstClass.y);
	}

}
