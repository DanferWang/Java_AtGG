package com.atguigu.intergradexer2;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();

		bank.addCustomer("Jane", "Smith");
		bank.getCustomer(0).setAccount(new Account(2000));
		bank.getCustomer(0).getAccount().withdraw(500);
		double balance1 = bank.getCustomer(0).getAccount().getBalance();
		System.out.println("用户[" + bank.getCustomer(0).getFirstName() + "," + bank.getCustomer(0).getLastName()
				+ "] 账户余额:" + balance1);
		
		System.out.println("***************************");
		
		System.out.println("银行当前用户数量为:"+bank.getNumberOfCustomer());
		bank.addCustomer("Danfer", "Wang");
		bank.getCustomer(1).setAccount(new Account(1000000));
		bank.getCustomer(1).getAccount().deposit(50000);
		bank.getCustomer(1).getAccount().withdraw(2);
		double balance2 = bank.getCustomer(1).getAccount().getBalance();
		System.out.println("用户[" + bank.getCustomer(1).getFirstName() + "," + bank.getCustomer(1).getLastName()
				+ "] 账户余额:" + balance2);
		
	}

}
