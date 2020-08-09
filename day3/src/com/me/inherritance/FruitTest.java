package com.me.inherritance;


public class FruitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	// Note that attribute name and getters/setters only in the base class. all other classes inherit attributes from base class
	
		Fruit fruit = new Fruit();
		Apple apple = new Apple();
		Orange orange = new Orange();
		GrannySmith granny = new GrannySmith();
		System.out.println(fruit.getName());
		System.out.println(orange.getName());
		System.out.println(apple.getName());
		System.out.println(granny.getName());
		System.out.println(granny.getColor());
		granny.setColor("green");
		orange.setColor("orange");
		System.out.println(granny.getColor());
		System.out.println(fruit.getColor());
		System.out.println(orange.getColor());

//		apple = granny;
//		System.out.println(apple.getName());
//
//		fruit = apple; // or fruit = granny but not granny = fruit
//		System.out.println(fruit.getName());



		
		
	}

}
