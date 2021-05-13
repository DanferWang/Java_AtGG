package com.atguigu.java1;

// this
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(1);
		System.out.println("age is " + p1.getAge());
		p1.eat();
		System.out.println("*****************");
		Person p2 = new Person("Danfer", 23);
		System.out.println(p2.getAge());
	}

}

class Person {
	private String name;
	private int age;

	public Person() {
		this.study();
		System.out.println("400 lines...");
	}
	
	public Person(int age) {
		this();
		this.age = age;
	}

	public Person(String name, int age) {
		this(age);
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void eat() {
		System.out.println("eats");
		this.study();
	}

	public void study() {
		System.out.println("studys");
	}
}