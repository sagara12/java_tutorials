package test;

/*
 * 임의의 수만큼 반복적으로 주사위를 던져 
 * 나온 눈의 합을 구하는 프로그램 
 */
public class DiceDemo {

	
	public static void main(String[] args) {
		// 던질 횟수
		int repeatNum = 10;
		int sum = 0;
		for (int i = 0; i < repeatNum; i++) {
			sum = sum + randomValueFromDice();
		}
		
		System.out.println(repeatNum + " 회 반복 주사위 값의 합: " + sum);
	}
	
	// 랜덤하게 나온 주사위의 눈을 리턴
	public static int randomValueFromDice() {
		int value = (int)(Math.random() * 6 + 1);
		System.out.println("주사위 던짐: " + value);
		return value;
	}

}
