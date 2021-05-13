package com.atguigu.java;

public class DataTypeValueTransferTest {
	public static void main(String[] args) {
		int m = 10;
		int n = m;

		System.out.println("*********基本数据类型**********");
		System.out.println("m = " + m + ", n = " + n);
		n = 20;
		System.out.println("m = " + m + ", n = " + n);
		
		System.out.println("*********引用数据类型**********");
		Order o1 = new Order();
		o1.orderId = 1001;
		Order o2 = o1; // 赋值以后，o1和o2都指向堆空间中同一个对象
		System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId = " + o2.orderId);
		o2.orderId = 1002;
		System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId = " + o2.orderId);
	}

}

class Order{
	int orderId;
}
