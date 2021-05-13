package com.atguigu.java;

public class PhoneTest {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		
		p1.sendEmail();
		p1.playGame();
		System.out.println("***********************");
		
		// 匿名
		new Phone().sendEmail();
		new Phone().playGame();
		new Phone().price = 1999;
		new Phone().showPrice();
		System.out.println("***********************");
		
		PhoneMall mall = new PhoneMall();
		mall.show(new Phone());
	}

}

class PhoneMall{
	
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	double price;
	
	public void sendEmail() {
		System.out.println("send Email");
	}
	
	public void playGame() {
		System.out.println("gaming");
	}
	
	public void showPrice() {
		System.out.println("the price is " + price);
	}
}
