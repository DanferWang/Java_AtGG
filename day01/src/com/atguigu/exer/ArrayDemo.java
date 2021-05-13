package com.atguigu.exer;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		// input number of students
		Scanner scanner = new Scanner(System.in);
		System.out.println("input number of students: ");
		int number = scanner.nextInt();

		// create array
		int[] scores = new int[number];
		// give scores of students in the array
		System.out.println("give score of every student: ");
		for (int i = 0; i < number; i++) {
			scores[i] = scanner.nextInt();
		}

		// get max value of the array
		int max = 0;
		for (int i = 0; i < number; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("max score is " + max);
		// set the grade of each student
		char level;
		for (int i = 0; i < number; i++) {
			if (max - scores[i] <= 10) {
				level = 'A';
			} else if (max - scores[i] <= 20) {
				level = 'B';
			} else if (max - scores[i] <= 30) {
				level = 'C';
			}
			else {
				level = 'D'; 
			}
			System.out.println("student " + i + " score is " + scores[i] + ", grade is " + level);
		}
	}
}
