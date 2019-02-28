package org.restudy.demo;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		// 정보 저장 (숫자 / 문자)
		char ch = 'a';
		String str = "Hello    World";
		System.out.println  (str.length()   );
		System.out.println (str.charAt(2));
		
		System.out.println(str.substring(0,5));
		
		// 사용자로 부터 값을 콘솔로 부터 입력
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		System.out.println(">>> " + input);
		
		while (scan.hasNext()) {
			input = scan.next();
			System.out.println(">>> " + input);
		}
		
		
	
		
		
		

	}

}
