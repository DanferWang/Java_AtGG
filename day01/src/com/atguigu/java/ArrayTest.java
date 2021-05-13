package com.atguigu.java;

public class ArrayTest {
	public static void main(String[] args) {
		// declare and initialize
		int num;
		num = 10;
		int id = 100;

		int[] ids; // declare
		// static initial
		ids = new int[] { 1001, 1002, 1003, 1004 };
		// dynamic initial
		String[] names = new String[5];

		// call the index of array
		names[0] = "Wang";
		names[1] = "Danfer";
		names[2] = "Haochen";
		names[3] = "王赫";
		names[4] = "Zhang";

		// the length of array
		System.out.println(names.length);
		System.out.println(ids.length);

		// forall in the array
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// default initial
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("**********");

		char[] arr1 = new char[4];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("**********");

		boolean[] arr2 = new boolean[4];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("**********");

		String[] arr3 = new String[4];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		if (arr3[0] == null) {
			System.out.println("nice null!");
		}
		System.out.println("**********");

		// array in memory

	}
}
