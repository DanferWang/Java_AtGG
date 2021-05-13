package com.atguigu.exer;

public class CylinderTest {
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		
		double v1 = c1.findVolume();
		System.out.println("Default volume is "+v1);
		
		Cylinder c2 = new Cylinder();
		c2.setRadius(2.3);
		c2.setLength(6.7);
		double v2 = c2.findVolume();
		System.out.println("Another cylinder volume is "+v2);
	}

}
