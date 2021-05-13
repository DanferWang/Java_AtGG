package com.atguigu.java;

// 封装性
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "Dog";
		a.age = 10;
//		a.legs = 4 ; // the field Animal.legs is not visible

		a.show();
		a.setLegs(6);
		System.out.println("legs: " + a.getLegs());
		a.show();

	}

}

class Animal {
	String name;
	int age;
	private int legs;

	// 对属性的设置
	public void setLegs(int l) {
		if (l >= 0 && l % 2 == 0) {
			legs = l;
		} else {
			legs = 0;
		}
	}

	// 对属性的获取
	public int getLegs() {
		return legs;
	}

	public void eat() {
		System.out.println(name + " eats.");
	}

	public void show() {
		System.out.println("name: " + name + ", age: " + age + ", legs: " + legs);
	}
}
