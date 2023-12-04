package com.child;

import com.parent.Car;

public class Audi extends Car {
	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.engineStart();
		audi.fuelType();
		Audi.gearSystem();
		System.out.println(audi.i);
	}
}
