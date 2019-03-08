package basic2;

import java.util.Arrays;

public class StringDemo {

	// 스트링을 뒤집는 프로그램
	// "abc" --> "cba"
	// "a" -> "a"
	
	public static void main(String[] args) {
		
		String str = "12345";
		//String result = change(str);
		String result = reverseStr(str);
		
		System.out.println(str + " --> " + result);
		
		str = "abc    tiger lion";
		result = makeTitle(str);
		
		System.out.println(str + " ==> " + result);
	}

	// 스트링을 뒤집는 메소드
	public static String change(String a) {
		char[] reverse = new char[a.length()];
		
		int index = a.length() - 1;
		for (int i = 0; i < reverse.length; i++) {
			reverse[i] = a.charAt(index);
			index--;
		}
		
		String result = new String(reverse);
		return result;
	}
	
	public static String reverseStr(String a) {
		String rev = new StringBuffer(a).reverse().toString();
		
		return rev;
	}
	
	// 스트링을 대문자버젼(Title)
	// abc --> Abc (Capitalize)
	// "abc    tiger lion" --> "Abc Tiger Lion" (Title)
	// 
	public static String makeTitle(String str) {
		char[] title = new char[str.length()];
		
		boolean needCap = true;
		// 주어진 스트링의 각 인덱스의 케릭터에 따라
		// 주어진 캐릭터가 글자이고, needCap true --> 대문자로 변환 쓰고, needCap false
		// 주어진 캐릭터가 화이트스페이스면 needCap false --> true
		for (int i = 0 ; i < title.length; i++) {
			if (Character.isLetter(str.charAt(i))) {
				if (needCap) {
					title[i] = Character.toUpperCase(str.charAt(i));
					needCap = false;
				} else {
					title[i] = str.charAt(i);
				}
			} else if (Character.isWhitespace(str.charAt(i))) {
				title[i] = str.charAt(i);
				needCap = true;
			// 화이트 스페이스일때 needCap을 true
			}	else {
				title[i] = str.charAt(i);
			}
		}
		
		return new String(title);
	}
}







