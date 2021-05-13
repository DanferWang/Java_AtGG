package com.atguigu.java;

public class Person extends Creature{
	String name;
	private int age;
	
	public Person() {
		
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("eats");
		sleep();
	}
	
	private void sleep() {
		System.out.println("sleeps");
	}

}
