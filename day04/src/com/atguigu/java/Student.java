package com.atguigu.java;

public class Student extends Person {
//	String name;
//	int age;
	String major;
	
	public Student() {
		
	}

	public Student(String name, int age, String major) {
		this.name = name;
		setAge(age);
		this.major = major;
	}
	
//	public void eat() {
//		System.out.println("eats");
//	}
//	
//	public void sleep() {
//		System.out.println("sleeps");
//	}
	
	public void study() {
		System.out.println("studys");
	}

}
