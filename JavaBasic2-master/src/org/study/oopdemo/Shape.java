package org.study.oopdemo;

// 도형의 클라스
// 추상 클라스
//   자식: Triangle, Rectangle, Circle
// 메소드:
//   void draw() -> 콘솔에 ....
//   double area() --> 면적 리턴
public class Shape {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println("Shape[" + color + "] is drawn");
	}

	public double area() {
		return 0.0;
	}

}
