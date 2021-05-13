package com.atguigu.exer;

public class StudentTestImprove {
	public static void main(String[] args) {
		Student1[] stus = new Student1[20];
		for (int i = 0; i < 20; i++) {
			stus[i] = new Student1();
			stus[i].number = i + 1;
			// 年级：[1,6]
			stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
			// 成绩：[0,100]
			stus[i].score = (int) (Math.random() * (100 - 0 + 1) + 0);
		}

		StudentTestImprove sti1 = new StudentTestImprove();
		sti1.print(stus);
		System.out.println("***********************");

		sti1.searchState(stus, 3);
		System.out.println("***********************");

		sti1.sort(stus);
		sti1.print(stus);
	}
	
	public void print(Student1[] stus) {
		for (int i = 0; i < stus.length; i++) {
			// System.out.println(stus[i].number+","+stus[i].state+","+stus[i].score);
			System.out.println(stus[i].info());
		}
	}
	
	public void searchState(Student1[] stus, int state) {
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].state == state) {
				System.out.println(stus[i].info());
			}
		}
	}
	
	public void sort(Student1[] stus) {
		for (int i = 0; i < stus.length - 1; i++) {
			for (int j = 0; j < stus.length - 1; j++) {
				if (stus[j].score > stus[j + 1].score) {
					Student1 temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}
	}

}

class Student1 {
	int number;
	int state;
	int score;

	public String info() {
		return "学号: " + number + " 年级: " + state + " 成绩: " + score;
	}
}