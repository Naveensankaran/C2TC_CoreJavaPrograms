//Program without exception handling
package com.tnsif.exceptionhandling;
public class WithoutExceptionHandling {

	public static void main(String[] args) {
		System.out.println("the program continues....");
		throw new ArithmeticException() {
		int data=100/0;
		};
		//System.out.println(data);
	}
	
}
