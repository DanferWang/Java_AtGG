package com.atguigu.javaDuotai;

public class Man extends Person {

	boolean isSmoking;
	
	public void earnMenoy() {
		System.out.println("man is earning.");
	}
	
	@Override
	public void eat() {
		System.out.println("man eats more.");
	}
	
	@Override
	public void walk() {
		System.out.println("man walks");
	}
}
