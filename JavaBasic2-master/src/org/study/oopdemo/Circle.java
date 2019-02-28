package org.study.oopdemo;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("Circle[" + getColor() 
			+ "] is drawn...");
	}
	
	public double area() {
		return radius * radius * Math.PI;
	}
}














