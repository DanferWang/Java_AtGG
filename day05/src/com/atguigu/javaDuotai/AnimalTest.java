package com.atguigu.javaDuotai;

public class AnimalTest {
	
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.func(new Dog());
		test.func(new Cat());
		
	}
	
	public void func(Animal animal) {
		animal.eat();
		animal.shout();
	}

}

class Animal{
	public void eat() {
		System.out.println("animal: eats");
	}
	
	public void shout() {
		System.out.println("animal: shouts");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("dog eats bone");
	}
	
	public void shout() {
		System.out.println("汪汪汪");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("cat eats fish");
	}
	
	public void shout() {
		System.out.println("喵喵喵");
	}
}
