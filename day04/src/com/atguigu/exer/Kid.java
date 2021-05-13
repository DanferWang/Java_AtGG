package com.atguigu.exer;

public class Kid extends Mankind{
	private int yearsOld;

	public Kid() {

	}

	public Kid(int yearsOld) {
		super();
		this.yearsOld = yearsOld;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public void printAge() {
		System.out.println("I am " + yearsOld + " years old.");
	}

}
