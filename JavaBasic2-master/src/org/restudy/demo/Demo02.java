package org.restudy.demo;

import java.util.Scanner;

public class Demo02 {

	// 콘솔로 부터 사람이름, 국어점수, 수학점수, 영어점수
	// 입력 받아 
	// 다음과 같이 출력
	//
	// 이름: xxx
	// 국어: 60
	// 수학: 10
	// 영어: 90
	// 총합: 
	
	public static void main(String[] args) {
		// 콘솔로 부터 이름, 점수들을 입력
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		String kScore = scanner.next();
		String mScore = scanner.next();
		String eScore = scanner.next();
		
		// 입력받은 정보가 스트링 --> 원하는 타입. 
		int[] scores = new int[3];
		
		// 세개의 점수가 모두 숫자?
		if (isDigit(kScore) && isDigit(mScore) && isDigit(eScore)) {
			scores[0] = Integer.parseInt(kScore);
			scores[1] = Integer.parseInt(mScore);
			scores[2] = Integer.parseInt(eScore);
		} else {
			System.out.println("잘못된 입력이 있습니다.");
			return;
		}

		System.out.println("이름: " + name);
		System.out.println("국어: " + scores[0]);
		System.out.println("수학: " + scores[1]);
		System.out.println("영어: " + scores[2]);
		System.out.println("총점: "  
						+ (scores[0] + scores[1] + scores[2]));
	}

	// 주어진(입력) 문자열의 모든 캐릭터가 숫자인지를 체크하여
	// true/false를 리턴
	public static boolean isDigit(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (!(num.charAt(i) >= '0' && num.charAt(i) <='9')) {
				return false;
			}
		}
		
		return true;
	}
}





