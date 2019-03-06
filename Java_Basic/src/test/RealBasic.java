package test;

import java.util.Arrays;

public class RealBasic {

	public static void main(String[] args) {
		
		System.out.println("Hello....");

		String result = sum("1", "2");
		
		String[] str = spliter(123);
		System.out.println(Arrays.toString(str));
	}
	
	public static String sum(String a, String b) {
		
		return a + b;
	}
	
	// 123 --> "1", "2", "3"
	// 1 --> "1"
	public static String[] spliter(int a) {
		String str = String.valueOf(a);
		int length = str.length();
		System.out.println(length);
		String[] result = new String[length];
		
		int index = 0;
		while (a > 0) {
			
			int remainder = a % 10;
			a = a / 10;
			result[index] = String.valueOf(remainder);
			index++;
			
			/*
			if (a < 10) {
				result[index] = String.valueOf(a);
				break;
			}
			*/
		}

		return result;
	}

}















