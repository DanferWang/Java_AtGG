package com.atguigu.java;

public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new Order();
		order.orderDefault = 1;
		order.orderPublic = 2;
//		order.orderPrivate = 3; // The field Order.orderPrivate is not visible
		
		order.methodDefault();
		order.methodPublic();
//		order.methodPrivate(); // The field Order.orderPrivate is not visible
	}

}
