package com.DL.first;

public class FirstClass {

	public static void main(String[] args) {
		//narrowing
		int j=1234567;
		short i=(short)j;
		System.out.println(j);
		System.out.println((byte)i);
		//widening
		short s=56;
		int k=s;
	}

}
