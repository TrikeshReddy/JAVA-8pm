package com.first;

public class FirstClass {
	protected static int proStatVar = 10;
	protected int proNonStatVar = 10;
	protected void protectedNonStatic() {
		System.out.println("protectedNonStatic called");
	}

	protected static void protectedStatic() {
		System.out.println("protectedStatic called");
	}

}
