package com.atguigu.exer;

public class Person{
	private int age;
	private String name;
	
	public Person(String n, int a) {
		age = a;
		name = n;
	}
	
	public void setAge(int i) {
		if(i >= 0 && i<= 130) {
			age = i;
		}else {
			age = 0;
			System.out.println("The age you input is out of range.");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name =n;
	}
	
	public String getName() {
		return name;
	}
}