package com.controls;

public class SwitchCase {

	public static void main(String[] args) {
		int i=3,j=9;
		String s="-";
		char c='s';
		boolean t=true;
		switch (c) {
		case 's':
			System.out.println(i+j);
			break;
		case 'h':
			System.out.println(i-j);
			break;
		default :
			System.out.println("invalid option");
			break;
		}
		System.out.println("exited switch succefully");

	}

}
