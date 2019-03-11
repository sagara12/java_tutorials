package basic2;

import java.util.Arrays;
import java.util.Scanner;

public class MvpApp {

	public static void main(String[] args) {
		// 사용자로 부터 입력 받아야 함.
		// 입력: K/D/A  
		// 10/5/7 --> "10" "5" "7"
		Scanner scanner = new Scanner(System.in);
		String[] values = null;
		int k = 0, d = 0, a = 0;
		double point = 0.0;
		double maxPoint = 0.0;
		int maxIndex = -1;
		
		for(int i = 1; i < 11; i++) {
			String line = scanner.nextLine();
			
			values = line.split("/");
			
			k = Integer.parseInt(values[0]);
			d = Integer.parseInt(values[1]);
			a = Integer.parseInt(values[2]);
			
			point = (k * 2 + a * 1) / (double)d;
			
			if (i == 1) {
				maxPoint = point;
				maxIndex = i;
			}
			
			if (point > maxPoint) {
				maxPoint = point;
				maxIndex = i;
			}
			
			//System.out.println("max: " + maxPoint);
		}

		/*
		System.out.println(Arrays.toString(values));
		System.out.println("k: " + k + ", d: " + d + ", a: " + a);
		System.out.println("Max: " + maxPoint + " Index: " + maxIndex);
		*/
		String mvp = "";
		if (maxIndex > 5) {
			mvp = "b" + (maxIndex - 5);
		} else {
			mvp = "a" + maxIndex;
		}
		
		System.out.println("MVP : " + mvp);
	}

}
