package com.atguigu.javaDuotai;

public class Woman extends Person {

	boolean isBeauty;
	
	public void goShopping() {
		System.out.println("woman shops");
	}
	
	@Override
	public void eat() {
		System.out.println("woman eats");
	}
	
	@Override
	public void walk() {
		System.out.println("woman walks");
	}
}
