package com.atguigu.exer;

public class ExersiceTest {
	public static void main(String[] args) {
		ExersiceTest et1 = new ExersiceTest();
		System.out.println(et1.method(10, 20));

	}

//	public void method() {
//		for(int i = 0;i<10;i++) {
//			for(int j=0;j<8;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}

//	public int method() {
//		for(int i = 0;i<10;i++) {
//			for(int j=0;j<8;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		return 10 * 8;
//	}

	public int method(int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return m * n;
	}
}
