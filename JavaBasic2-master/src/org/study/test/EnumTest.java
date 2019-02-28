package org.study.test;

public class EnumTest {

	private static final int APPLE = 1;
	private static final int PEAR = 2;
	private static final int ORANGE = 3;
	private static final int PINEAPPLE = 4;
	
	public static void main(String[] args) {
		// 사과(1), 배(2), 오렌지, 파인애플
		
		FruitType fruitType = FruitType.APPLE;
		
		//fruitType = 10;
	}

}

enum FruitType {
	APPLE, PEAR, ORANGE, PINEAPPLE;
}
