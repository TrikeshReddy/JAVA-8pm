package com.first;

public class FirstClass {
	private int nonStaticVariable=80;
	private static  int staticVariable=80;
	private void nonStatic() {
		System.out.println("private non static method called");
	}
	public void callNonStatic() {
		nonStatic();
	}
	private static void staticMethod() {
		System.out.println("private static method called");
	}
	public static void callStatic() {
		staticMethod();
	}
	public int getStaticVariable() {
		return nonStaticVariable;	
	}
	public static int getStaticVariablefrmStat() {
		return staticVariable;	
	}
}

class subClass {
	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass();
		firstClass.callNonStatic();
		FirstClass.callStatic();
	}
}
