package com.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		Shapes shapes = new Shapes();
		shapes.area();//shape class method implementation
		Triangle triangle = new Triangle();
		triangle.area();//triangle class method implementation
		Square square= new Square();
		square.area();//square class method implementation
	}

}
