package org.restudy.demo;

import java.util.Scanner;

public class Demo03 {

	// Email 주소
	//   abc@gamil.com
	//
	// 이메일 주소에서 도메인 이름과 사용자 아이디를 추출해내는 작업
	//
	// 콘솔에서 이메일 주소를 입력 받아,
	//  1. 적절한 이메일 주소 형태인지 체크
	//  2. 아이디: abc
	//     도메인: gmail.com
	//  
	//  이메일 포멧 인지 체크하는 메소드
	//  
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("이메일을 입력하세요: ");
		String email = scanner.next();
		
		//1. 이메일 유효성 검사
		if (checkEmailForm(email)) {
			// 유효한 경우, 아이디/도메인 추출
			//System.out.println(">> Email: " + email);
			System.out.println("ID: " + getIdFromEmail(email));
			System.out.println("Domain: " + getDomainFromEmail(email));
		} else {
			System.out.println("유효하지 않은 이메일 형식입니다");
			return;
		}
	}
	
	// 이메일 유효성 검사
	// @의 유무를 통해 유효성을 검사하는 것으로 한정
	// @가 중간에 있어야 함.
	public static boolean checkEmailForm(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i != 0 && i != str.length() - 1) {
				if (str.charAt(i) == '@') {
					return true;	
				}
			}
		}
		
		return false;
		
		/*
		if (str.matches("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$")) {
			return true;
		} else {
			return false;
		}
		*/
	}
	
	// 유효한 이메일 주소가 입력되는 것으로 가정하고,
	// @앞 부분문자열을 추출하여 리턴
	public static String getIdFromEmail(String email) {
		// "abc@xyz"
		int index = email.indexOf('@');
		
		if (index != -1) {
			return email.substring(0, index);
		}
		
		/*
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				return email.substring(0, i);
			}
		} */
		
		return null;
	}
	
	public static String getDomainFromEmail(String email) {
		// "abc@xyz"
		int index = email.indexOf('@');
		
		if (index != -1) {
			return email.substring(index + 1);
		}
		
		return null;
	}

}









