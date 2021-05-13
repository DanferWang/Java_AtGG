package com.atguigu.exer;

public class Mankind {
	private int sex;
	private int salary;

	public void manOrWoman() {
		if (sex == 1) {
			System.out.println("man");
		} else if (sex == 0) {
			System.out.println("woman");
		}
	}

	public Mankind() {

	}

	public Mankind(int sex, int salary) {
		super();
		this.sex = sex;
		this.salary = salary;
	}

	public void employeed() {
		if (salary == 0) {
			System.out.println("no job");
		} else {
			System.out.println("job salary is " + salary);
		}
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
