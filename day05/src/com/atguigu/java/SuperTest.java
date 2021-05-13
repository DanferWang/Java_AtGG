package com.atguigu.java;

public class SuperTest {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.show();
		
		stu.study();
		
		Student stu1 = new Student("Tom", 21, "CS");
		stu1.show();
	}

}
