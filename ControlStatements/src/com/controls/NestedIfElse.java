package com.controls;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=100,b=20,c=45;
		if(a>b)
		{
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else
		{
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
	}

}
