package org.study.test;

public class Exam02 {

	// 두개의 주사위를 던져(랜덤) 나온 눈의 값
	// (눈1, 눈2) 표시
	// 합이 5가 될때 까지 연속해서 실시
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while (sum != 5) {
			i++;
			// 0(포함) ~ 1(작은) 사이의 실수
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			sum = dice1 + dice2;
			
			if (sum == 5) {
				System.out.println("\n---- WOW(" + i + ") ----");
			}
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			
		}
		 
	}

}
