package com.atguigu.exer;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 2.8;
		System.out.println("the radius is " + c1.radius);
		double area = c1.findArea();
		System.out.println("the area is " + area);
	}

}

class Circle {
	double radius;

	public double findArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
}