package basic2;

import java.util.Scanner;

public class AOSMvpApp {

	public static void main(String[] args) {
		// 게임유저의 K/D/A 값을 입력
		// 콘솔로 부터 위의 포맷되로 입력
		AOSUser[] users = new AOSUser[10];
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			String line = scanner.nextLine();
			String[] values = line.split("/");
			int k = Integer.parseInt(values[0]);
			int d = Integer.parseInt(values[1]);
			int a = Integer.parseInt(values[2]);
			
			AOSUser user = new AOSUser();
			user.k = k;
			user.d = d;
			user.a = a;
			
			users[i] = user;
		}
		
		// 게임유저의 점수를 계산
		for (int i = 0; i < users.length; i++) {
			users[i].evaluatePoint();
			System.out.println(users[i]);
		}
		
		// MVP 선출
		AOSUser mvpUser = selectMVP(users);
		System.out.println("MVP: " + mvpUser);
	}
	
	public static AOSUser selectMVP(AOSUser[] users) {
		return null;
	}

}

class AOSUser {
	int k;
	int d;
	int a;
	double point;
	
	public void evaluatePoint() {
		point = (k * 2 + a * 1) / (double)d;
	}
	
	@Override
	public String toString() {
		return "AOSUser [k=" + k + ", d=" + d + ", a=" + a + ", point=" + point + "]";
	}

}
