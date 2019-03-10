package learn.basic.controll_flow;

import java.util.Scanner;

public class _01_IfElseDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("100보다 작은 정수 입력: ");
		int num = scanner.nextInt();
		
		if (num < 100) {
			System.out.println("Thanks, 입력한 값: " + num);
		} else {
			System.out.println("잘못 입력하였습니다");
		}

	}

}
