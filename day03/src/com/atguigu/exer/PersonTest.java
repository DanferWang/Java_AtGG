package com.atguigu.exer;

public class PersonTest {
	public static void main(String[] args) {
		Person b = new Person("Tom",18);
		b.setAge(23);
		System.out.println("b's age is " + b.getAge() + " name is "  + b.getName());
		
		b.setAge(150);
	}

}
