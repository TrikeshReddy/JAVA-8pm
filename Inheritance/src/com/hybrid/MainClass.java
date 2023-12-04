package com.hybrid;

public class MainClass {
	public static void main(String[] args) {
		//this will access to A&B class methods
		B b =new B();
		//this will access to A,B&C not D class methods
		C c =new C();
		//this will access to A,B & D not C class methods
		D d =new D();
		d.m1();
		d.m2();
		d.m4();
		
		
		
		
	}
}
