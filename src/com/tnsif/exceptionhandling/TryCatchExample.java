//program to demonstrate try catch block
package com.tnsif.exceptionhandling;

public class TryCatchExample {
	static int performDivision(int x, int y) {
		System.out.println("I am in performDivision method which return int ");		
		return x / y;
	}

	static float performDivision(float a, float b) {
		System.out.println("I am in performDivision method which return float ");
		return a / b;
	}
}