package org.study.oopdemo;

public class Triangle extends Shape {

	private double width;
	private double height;
	
	// 생성자
	public Triangle(double width, double height) {
		//super();  // --> Shape();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("Trianle[" + getColor() 
				+ "] is drawn...");
	}
	
	@Override
	public double area() {
		return width * height * 0.5;
	}
}










