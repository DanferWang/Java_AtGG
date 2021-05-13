package com.atguigu.java;

// TestClass
public class PersonTest {
	public static void main(String[] args) {
		// create an object of the class
		Person p1 = new Person();
		// call the structure of the object
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);

		p1.eat();
		p1.sleep();
		p1.talk("Chinese");

		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.isMale);

		Person p3 = p1;
		System.out.println(p3.name);
		p3.age = 10;
		// p3 is the address of p1's object in heap
		System.out.println(p1.age);
	}

}

class Person {
	// field
	String name;
	int age;
	boolean isMale;

	// method
	public void sleep() {
		System.out.println("can sleep");
	}

	public void talk(String language) { // local variable
		System.out.println("can speak " + language);
	}

	public void eat() {
		String food = "pizza"; // local variable
		System.out.println(name + "'d like to eat " + food);
	}
}