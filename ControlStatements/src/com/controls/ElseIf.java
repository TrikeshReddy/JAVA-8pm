package com.controls;

public class ElseIf {

	public static void main(String[] args) {
		int marks=79;
		//grading system
		//90-100->A+,80-89->A,70-79->B,69-50->c,0-49->f
		if(marks>90 && marks <100)
		{
			System.out.println("A+");
		}
		else if(marks>80 && marks<=89) {
			System.out.println("A");
		}
		else if(marks>70 && marks <=79) {
			System.out.println("B");
		}
		else if(marks>=50 && marks <=69) {
			System.out.println("c");
		}
		else if(marks <49 && marks >0 ){
			System.out.println("f");
		}
		else {
			System.out.println("invalid value");
		}		
	}

}
