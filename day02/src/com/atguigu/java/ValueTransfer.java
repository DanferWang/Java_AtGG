package com.atguigu.java;

// 值传递机制
public class ValueTransfer {
	public static void main(String[] args) {
		
		int m = 10;
		int n = 20;
		System.out.println("m = " + m + ", n = " + n);
		System.out.println("******基本数据类型********");
		
		// 交换两个变量的值
		ValueTransfer test = new ValueTransfer();
		test.swap(m, n);
		System.out.println("********************");
		System.out.println("m = " + m + ", n = " + n);
		System.out.println("******引用数据类型********");
		
		Data data = new Data();
		data.m = 10;
		data.n = 20;
		test.swapData(data);
		System.out.println("********************");
		System.out.println("m = " + data.m + ", n = " + data.n);
		
	}
	public void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
		System.out.println("m = " + i + ", n = " + j);
	}
	public void swapData(Data d) {
		int temp = d.m;
		d.m = d.n;
		d.n = temp;
		System.out.println("m = " + d.m + ", n = " + d.n);
	}

}

class Data{
	int m;
	int n;
}

