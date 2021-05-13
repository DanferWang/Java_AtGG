package com.atguigu.java;

public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest m1 = new MethodArgsTest();
		m1.show(1);
		m1.show("Hello");
		m1.show("Hello", "world");
		m1.show();
	}

	// 可变个数形参
	public void show(int i) {
		System.out.println("show(int i)");
	}

	public void show(String s) {
		System.out.println("show(String s)");
	}

	public void show(String... strs) {
		System.out.println("show(String ... strs)");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	
	public void show(int i,String ... strs) {
		
	}

}
