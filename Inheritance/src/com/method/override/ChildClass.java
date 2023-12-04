package com.method.override;

public class ChildClass extends ParentMethod {
	public static void main(String[] args) {
		ParentMethod parentMethod = new ParentMethod();
		parentMethod.engineON();
		ChildClass.fuelType();
	}

	@Override
	public void engineON() {
		System.out.println("click on button");
	}

	public static void fuelType() {
		System.out.println("cng");
	}

}
