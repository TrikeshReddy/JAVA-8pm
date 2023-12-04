package com.patterns;

public class pattern1 {
	public static void main(String[] args) {
		// pattern1
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		// pattern2
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i >= j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		// pattern3
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j >= 4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

		// pattern4
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j <= 4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
