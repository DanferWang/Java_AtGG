package com.atguigu.java;

public class ExtendTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(1);;
		p1.eat();
		
		Student s1 = new Student();
		s1.setAge(2);;
		s1.eat();
		s1.name = "wang";
		s1.breath();
	}

}
