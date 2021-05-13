package com.atguigu.java;

public class CustomerTest {
	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.eat();
	}

}


class Customer{
	String name;
	int age;
	boolean isMale;
	
	
	public void eat() {
		System.out.println("Customer eats.");
		return;
	}
	
	public void sleep(int hours) {
		System.out.println("Customer sleeps for " + hours + " hours.");
		eat();
	}
	
	public String getName() {
		if (age > 18) {
			return "Tom";
		}else {
			return name;
		}
	}
	
	public String getNationality(String nation) {
		String info = " My nationality is "+nation+".";
		return info;
	}
}