package org.study.test;

public class Exam01 {

	// For를 사용하여 1 ~ 100 중에 3의 배수의 합
	public static void main(String[] args) {

		int sum = 0;
		/*
		 * for (int i = 1; i <= 100; i++) { // 3의 배수일때, if (i % 3 == 0) { // sum = sum +
		 * i; sum += i; } }
		 */

		int i = 1;
		while (i <= 100) {
			// 3의 배수일때,
			if (i % 3 == 0) {
				// sum = sum + i;
				sum += i;
			}
			
			i++;
		}

		System.out.println("3의 배수의 합: " + sum);

	}

}
