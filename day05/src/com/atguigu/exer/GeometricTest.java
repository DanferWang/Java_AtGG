package com.atguigu.exer;

public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		
		Circle c1 = new Circle(2.8, "green", 0.3);
		test.displayGeometricObject(c1);
		Circle c2 = new Circle(8.4, "yellow", 0.3);
		test.displayGeometricObject(c2);
		MyRectangle r1 = new MyRectangle(29, 3, "blue", 1.0);
		MyRectangle r2 = new MyRectangle(3, 29, "pink", 1.0);
		System.out.println(test.equalArea(r1, r2));
		
		System.out.println("************************************");
		System.out.println("color equal? " + c1.getColor().equals(c2.getColor()));
		System.out.println("radius equal? " + c1.equals(c2));
		System.out.println(c2.toString());
		
	}

	public boolean equalArea(GeometricObject o1, GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}
	
	public void displayGeometricObject(GeometricObject o) {
		System.out.println("The area is " + o.findArea());
	}
}
