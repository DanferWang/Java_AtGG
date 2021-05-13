package com.atguigu.java;

public class Student extends Person{
	String major;
	String id = "1002";
	
	public Student() {
		
	}

	public Student(String major) {
		this.major = major;
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public void study() {
		System.out.println("major in " + this.major);
		this.eat();
		super.eat();
	}
	
	// overwrite
	public void eat() {
		System.out.println("healthy diet");
	}
	
	public void show() {
		System.out.println("name= " + this.name + ", age= " + super.age);
		System.out.println("id= " + this.id);
		System.out.println("id= " + super.id);
	}
}
