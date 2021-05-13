package com.atguigu.exer;

public class YangHui {
	public static void main(String[] args) {
		// declare
		int[][] yanghui = new int[10][];
		
		// initialize
		for(int i = 0; i < yanghui.length;i++) {
			yanghui[i] = new int[i + 1];
			for(int j = 0;j < yanghui[i].length;j++) {
				yanghui[i][j] = 1;
			}
		}
		
		// define YangHui's rule
		for(int i = 2; i < yanghui.length;i++) {
			for(int j = 1; j < yanghui[i].length-1;j++) {
				yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
			}
		}
		
		// forall
		for(int i = 0; i < yanghui.length; i++) {
			for(int j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
