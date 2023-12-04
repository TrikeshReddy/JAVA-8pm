package com.second;

import com.first.FirstClass;

public class SecondClass {
	public static void main(String[] args) {
		FirstClass firstClass=new FirstClass();
		firstClass.callNonStatic();
		FirstClass.callStatic();
		
		int accessPvtStaticVar = firstClass.getStaticVariable();
		System.out.println(accessPvtStaticVar);
		System.out.println(FirstClass.getStaticVariablefrmStat());
	}
}
