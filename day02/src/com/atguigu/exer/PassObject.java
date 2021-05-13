package com.atguigu.exer;

// 值传递机制
public class PassObject {
	public static void main(String[] args) {
		PassObject test = new PassObject();
		Circle2 c = new Circle2();
		test.printAreas(c, 5);
		System.out.println("now radius is " + c.radius);
	}
	
	public void printAreas(Circle2 c, int time) {
		System.out.println("Radiius\t\tArea");
		for(int i = 1;i<=time;i++) {
			c.radius = i;
			System.out.println(c.radius+"\t\t"+c.findArea());
		}
		c.radius = time + 1;
	}

}
