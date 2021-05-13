package com.atguigu.java;

public class Recursion {
	public static void main(String[] args) {
		Recursion test = new Recursion();
		int sum = test.getSum(100);
		System.out.println(sum);
		int res = test.func(10);
		System.out.println(res);
		int[] f = new int[10];
		for (int i = 1; i < f.length; i++) {
			System.out.print(test.fibonacci(i) + "\t");
		}
	}

	public int getSum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + getSum(n - 1);
		}
	}

	public int func(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 4;
		} else {
			return 2 * func(n - 1) + func(n - 2);
		}
	}

	public int fibonacci(int n) {
		if (n == 1) {
			int res = 1;
			return res;
		} else if (n == 2) {
			int res = 1;
			return res;
		} else {
			int res = fibonacci(n - 1) + fibonacci(n - 2);
			return res;
		}
	}

}
