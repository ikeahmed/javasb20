package com.me.inherritance;


public class Fruit {
	protected String name;
	private String color;
	Fruit() {
		name = "Fruit";
		color = "red";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() { return color; }

	public void setColor(String color) { this.color = color; }
}
