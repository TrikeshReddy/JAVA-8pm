package com.second;

import com.first.FirstClass;
// this is for a reference that we cannot access a protected method in another package
public class SecondClass {
	public static void main(String[] args) {
		FirstClass firstClass =new FirstClass();
		firstClass.protectedNonStatic();
		FirstClass.protectedStatic();
	}
}
