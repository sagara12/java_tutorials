package basic2;

import java.util.Arrays;
import java.util.Scanner;

public class MvpApp2 {

	public static void main(String[] args) {
		// 사용자로 부터 입력 받아야 함.
		// 입력: K/D/A  
		// 10/5/7 --> "10" "5" "7"
		Scanner scanner = new Scanner(System.in);
		int[][] users = new int[10][3];
		double[] userPoints = new double[10];
		
		for (int i = 0; i < 10; i++) {
			String line = scanner.nextLine();
			String[] values = line.split("/");
			
			users[i][0] = Integer.parseInt(values[0]);
			users[i][1] = Integer.parseInt(values[1]);
			users[i][2] = Integer.parseInt(values[2]);
			
			// 사용자의 점수계산
			userPoints[i] = 
					calcUserPoint(users[i][0], users[i][1], users[i][2]);
		}

		printUsers(users, userPoints);
		printSortUsers(users, userPoints);
		
	}

	private static void printSortUsers(int[][] users, double[] userPoints) {
		// TODO Auto-generated method stub
		
	}

	private static void printUsers(int[][] users, double[] userPoints) {
		System.out.println("---------");
		System.out.println("User Info");
		for (int i = 0; i < users.length; i++) {
			System.out.print(users[i][0] + ", " + users[i][1] + ","
					+ users[i][2]);
			System.out.println(" point: " + userPoints[i]);
		}
		System.out.println("---------");
	}

	private static double calcUserPoint(int k, int d, int a) {
		double point = (k * 2 + a * 1) / (double)d;
		return point;
	}

}
