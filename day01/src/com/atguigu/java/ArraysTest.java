package com.atguigu.java;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		// equals
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,3,2,4};
		boolean isEqual = Arrays.equals(arr1, arr2);
		System.out.println(isEqual);
		
		// toString
		System.out.println(Arrays.toString(arr2));
		
		// fill
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		// sort
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		// binarySearch
		int[] arr3 = new int[] {-21,-3,6,14,25,60,102};
		int index = Arrays.binarySearch(arr3, 64);
		if(index >=0 ) {
			System.out.println(index);
		}
		else {
			System.out.println("not found");
		}
	}
}
