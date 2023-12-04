package com.first;

import com.first.FirstClass;

public class SecondClass {
	public static void main(String[] args) {
		FirstClass firstClass =new FirstClass();
		firstClass.protectedNonStatic();
		FirstClass.protectedStatic();
		//access protected static variable in same package
		System.out.println(FirstClass.proStatVar);
		//access protected non static variable in same package
		System.out.println(firstClass.proNonStatVar);
	}
}
