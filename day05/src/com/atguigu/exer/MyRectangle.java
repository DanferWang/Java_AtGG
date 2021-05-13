package com.atguigu.exer;

public class MyRectangle extends GeometricObject {
	private double height;
	private double width;

	public MyRectangle(double height, double width, String color, double weight) {
		super(color, weight);
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double findArea() {
		double area;
		area = this.height * this.width;
		return area;
	}
}
