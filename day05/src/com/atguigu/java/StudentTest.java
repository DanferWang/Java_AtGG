package com.atguigu.java;

public class StudentTest {
	public static void main(String[] args) {
		Student stu1 = new Student("CS");
		
		stu1.eat();
		stu1.walk(100);
		stu1.study();
		
		Person per1 = new Person();
		per1.eat();
	}

}
