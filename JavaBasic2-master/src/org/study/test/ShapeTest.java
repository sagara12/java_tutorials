package org.study.test;

import org.study.oopdemo.Circle;
import org.study.oopdemo.Shape;
import org.study.oopdemo.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		/*
		 * Shape a = new Triangle(10.0, 5.5); // 다형성 (polymorphism) a.draw();
		 * System.out.println("삼각형 면적: " + a.area());
		 */
		
		Shape[] shapes = new Shape[3];
		for (int i = 0; i < shapes.length; i++) {
			if (i % 2 == 0) {
				double w = Math.random() * 10;
				double h = Math.random() * 8;
				shapes[i] = new Triangle(w, h);
			} else {
				shapes[i] = new Circle(Math.random() * 5);
			}	 
		}
		
		for (Shape s : shapes) {
			s.draw();
			System.out.println("면적: " + calcShapeArea(s));
		}
	}
	
	public static double calcShapeArea(Shape shape) {
		return shape.area();
	}
	
}
