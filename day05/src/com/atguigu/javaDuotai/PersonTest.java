package com.atguigu.javaDuotai;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 =new Person();
		p1.eat();
		
		Man m1 = new Man();
		m1.eat();
		m1.age = 25;
		m1.earnMenoy();
		
		Person p2 = new Man();
		
		p2.eat();
		p2.walk();
		
//		p2.earnMoney();
		
		Man m2 = (Man) p2;
		m2.earnMenoy();
		m2.isSmoking = true;
		
		if(p2 instanceof Woman) {
			Woman w2 = (Woman)p2;
			w2.goShopping();
			System.out.println("Woman");
		}
		
		if(p2 instanceof Man) {
			Man w2 = (Man)p2;
			w2.earnMenoy();
			System.out.println("Man");
		}
		
		if(p2 instanceof Person) {
			System.out.println("Person");
		}
	}
}
