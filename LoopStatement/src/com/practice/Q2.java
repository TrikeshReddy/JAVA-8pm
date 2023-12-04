package com.practice;

public class Q2 {

	public static void main(String[] args) {
//		write a java program to print numbers from 0-99 which has 5 in the end
//		output:5,15,25,35,45,65,55,75,85,95
		for(int i=0;i<100;i++) {
			if(i%10 == 5) {
				System.out.println(i);
			}
		}
	}

}
