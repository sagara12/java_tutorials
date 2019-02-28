package org.study.test;

import java.util.Scanner;

public class Exam03 {

	// 예금 관리 프로그램
	// 1 1000 --> 1000원 예금
	// 2 400  -->400 출금
	// 3 --> 잔고
	// 4 --> 종료
	public static void main(String[] args) {
		
		printUsage();
		
		int com = 0;
		int deposit = 0;
		int totalAmount = 100000;
		
		while (true) {
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			
			String[] commands = input.split("[\\s]+");
			
			com = Integer.parseInt(commands[0]);
			if (commands.length >= 2) {
				deposit = Integer.parseInt(commands[1]);
			}

			if (com == 1) {
				totalAmount = totalAmount + deposit;
				System.out.println(deposit + " 예금 처리");
				System.out.println("잔액: " + totalAmount);		
			} else if(com == 2) {
				if (totalAmount >= deposit ) {
					totalAmount = totalAmount - deposit;
					
					System.out.println(deposit + " 출금 처리");
					System.out.println("잔액: " + totalAmount);
				} else {
					System.out.println("잔액이 부족합니다.");
					System.out.println("잔액: " + totalAmount);
				}
				
			} else if (com == 3) {
				System.out.println("조회 처리");
				System.out.println("잔액: " + totalAmount);
			} else if (com == 4) {
				break;
			}
			
			System.out.print("다른 명령어 입력: ");
		}
		
		System.out.println("이용 감사");
	}
	
	public static void printUsage() {
		System.out.println("---- 은행 -----");
		System.out.println("사용법 안내");
		System.out.println("1 1000(예금액)");
		System.out.println("2 1000(출금액)");
		System.out.println("3 (조회)");
		System.out.println("4 (종료)");
		
		System.out.print("명령 입력: ");
	}
}










