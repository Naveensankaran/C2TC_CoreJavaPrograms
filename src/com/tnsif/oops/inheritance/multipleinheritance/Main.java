package com.tnsif.oops.inheritance.multipleinheritance;

 interface Walkable {
	 void walk();

}

 interface swimable{
	void swim();
}
 
 class Human implements Walkable , swimable{

	@Override
	public void swim() {
		System.out.println("Human can walk");
		
	}

	@Override
	public void walk() {
		System.out.println("Human can swim");
		
	}
	 
 }

public class Main{
	public static void main(String[] args) {
		Human obj = new Human();
		obj.swim();
		obj.walk();
		
	}
}
