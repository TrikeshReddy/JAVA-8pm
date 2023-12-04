package com.second.pack;

import com.first.pack.FirstClass;

public class SecondClass {
	public static void main(String[] args) {
		FirstClass.staticMethod();
		int j= FirstClass.i;
		System.out.println(j);
		FirstClass obj = new FirstClass();
		int k=obj.j;
		System.out.println(k);
		obj.nonStaticMethod();
	}
}
