package com.atguigu.intergradexer2;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;

	public Bank() {
		customers = new Customer[10];
	}

	public void addCustomer(String f, String l) {
		if (this.getNumberOfCustomer() <= customers.length) {
			Customer customer = new Customer(f, l);
			customers[this.getNumberOfCustomer()] = customer;
			numberOfCustomer += 1;
			System.out.println("成功添加[" + customer.getFirstName() + "," + customer.getLastName() + "]");
		} else {
			System.out.println("超出Bank可容纳用户人数");
		}
	}

	public Customer getCustomer(int index) {
		if (index >= 0 && index < numberOfCustomer) {
			return customers[index];
		}
		return null;
	}

	public int getNumberOfCustomer() {
		return numberOfCustomer;
	}

}
