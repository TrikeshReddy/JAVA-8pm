package com.first.pack;

public class SecondClass {
	public static void main(String[] args) {
		FirstClass.staticMethod();
		int j= FirstClass.i;
		System.out.println(j);
		FirstClass obj = new FirstClass();
		int k=obj.j;
		obj.staticMethod();
		int o=obj.i;
		System.out.println(o);
		System.out.println(k);
		obj.nonStaticMethod();
	}
}
