package com.atguigu.java;

// constructor
public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		
		Person p1 = new Person("Tom", 10);
		System.out.println(p1.name);
	}

}

class Person{
	// field
	String name;
	int age;
	
	// constructor
	public Person() {
		System.out.println("Person()...");
	}
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	
	// method
	public void eat() {
		System.out.println("eats");
	}
	public void study() {
		System.out.println("studys");
	}
}
