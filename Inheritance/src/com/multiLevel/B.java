package com.multiLevel;

public class B extends A {
	public void m2() {
		System.out.println("B m2");
	}
	public static void main(String[] args) {
		B b =new B();
		//b.m3(); cannot have an acces to child class methods
	}
}
