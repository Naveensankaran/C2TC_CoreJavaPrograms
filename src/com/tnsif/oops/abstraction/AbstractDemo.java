//Program to demonstrate abstraction
package com.tnsif.oops.abstraction;


public class AbstractDemo {

	public static void main(String[] args) {
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		sq.calArea();
		sq.show();
		sq.greeting();
		r1.calArea();
		r1.show();
		r1.greeting();
		
		
		System.out.println("------------------------------------------------");
		
		
		Shape shape;
		shape=new Square(12.5f);
		
		shape.calArea(); 
		shape.show();
		
		shape=new Rectangle(10,20);
		
		shape.calArea(); 
		shape.show();
		
	}

}
