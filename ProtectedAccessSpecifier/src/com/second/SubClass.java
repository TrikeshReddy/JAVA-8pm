package com.second;

import com.first.FirstClass;

//creating an object for sub class for acccesing the protectednonstaticmethod of parent
public class SubClass extends FirstClass {
	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		subClass.protectedNonStatic();
		FirstClass.protectedStatic();

		// access protected static variable in diff package
		System.out.println(FirstClass.proStatVar);
		// access protected non static variable in diff package
		System.out.println(subClass.proNonStatVar);
	}
}
