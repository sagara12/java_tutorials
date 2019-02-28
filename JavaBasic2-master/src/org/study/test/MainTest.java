package org.study.test;

public class MainTest {

	public static void main(String[] args) {
		Integer i = 10;
		// 좌측에 있는 객체의 타입이 우측의 슈퍼클라스 또는 인터페이스의 
		// 자식인지 조사하는 비교연산자
		if (i instanceof Number) {
			System.out.println("정수입니다.");
		}else {
			System.out.println("정수가 아닙니다.");
		}
		
		int score = 90;
		
		String result = (score > 90) ? "우수" : "보통";
		System.out.println(result);
	}

}
