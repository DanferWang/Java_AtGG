package com.atguigu.java;

public class TwoDArrayTest {
	public static void main(String[] args) {
		// declare and initialize
		// static
		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr4 = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };
		// dynamic
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][];

		// call the index
		System.out.println(arr1[0][2]);
		System.out.println(arr2[1][1]);

		arr3[1] = new String[4];
		System.out.println(arr3[1][0]);
		System.out.println("*********");
		
		// get the length of the twoDArray
		System.out.println(arr4.length);
		System.out.println(arr4[1].length);
		System.out.println("*********");
		
		// forall the array
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("*********");
		
		// default value
		int[][] arrd = new int[4][3];
		System.out.println(arrd[0]);
		System.out.println(arrd[0][0]);
		System.out.println("*********");
		double [][] arrd1 = new double [3][];
		System.out.println(arrd1[1]);
	}
}
