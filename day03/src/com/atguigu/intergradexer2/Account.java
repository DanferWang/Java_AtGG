package com.atguigu.intergradexer2;

public class Account {
	private double balance;

	public Account(double init_balance) {
		this.balance = init_balance;
		System.out.println("成功创建账户，余额为:" + init_balance);
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amt) {
		if (amt > balance) {
			System.out.println("余额不足，取款失败");
			return;
		}
		balance -= amt;
		System.out.println("成功取出" + amt + ", 余额为：" + balance);
	}

	public void deposit(double amt) {
		if (amt > 0) {
			balance += amt;
			System.out.println("成功存入" + amt + ", 余额为：" + balance);
		}
	}

}
