package com.atguigu.exer;

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setBase(10.2);
		t1.setHeight(4.6);
		System.out.println("base: " + t1.getBase() + " height: " + t1.getHeight());
		
		Triangle t2 = new Triangle(3.6, 8.7);
		System.out.println("base: " + t2.getBase() + " height: " + t2.getHeight());
	}

}
