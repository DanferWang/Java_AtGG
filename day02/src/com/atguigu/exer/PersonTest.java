package com.atguigu.exer;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "Danfer";
		p1.age = 23;
		p1.sex = 1;
		
		p1.study();
		p1.showAge();
		p1.addAge(2);
		
		System.out.println("new age is "+p1.age);
		p1.showAge();
		
		Person p2 = new Person();
		p2.showAge();
		p2.addAge(20);
		p2.showAge();
		
		p1.showAge();
	}

}
