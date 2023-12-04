package com.DL.Operators;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class LogicalOperators {
	//(&&,||,!)
	
	public static void main(String[] args) {
		int i=10,j=20;
		//AND(&&)
		System.out.println(i==j && i>j);//f && f==>f
		System.out.println(i<=j && i<j);//t && T==>t
		System.out.println(i<=j && i>j);//t && f==>f
		System.out.println(i>j && i<=j);//f && t=>f
		//OR(||)
		System.out.println(i==j || i>j);//f || f==>f
		System.out.println(i<=j || i<j);//t || T==>t
		System.out.println(i<=j || i>j);//t || f==>t
		System.out.println(i>j || i<=j);//f || t=>t
		//NOT(!)
		System.out.println(!(i==j));
		System.out.println(!(i<=j));
	}
}
