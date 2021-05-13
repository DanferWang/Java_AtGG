package com.atguigu.java;

public class Person {
	String name;
	int age;
	String id = "1000";
	
	public Person() {
		
	}

	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public void eat() {
		System.out.println("having lunch...");
	}
	
	public void walk(int distance) {
		System.out.println("walk for " + distance + " km.");
	}

}
