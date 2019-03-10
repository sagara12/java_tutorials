package learn.basic.type_var;

public class _01_VariablesTypeDemo {

	public static void main(String[] args) {
		int intVar = 1;
		long longVar = 10L;

		short shortVar = 5;
		byte byteVar = 11;

		char charVar = 'a';
		char charVar2 = '\u00A7';

		double doubleVar = 3.14;
		float floatVar = 5.2f;

		String str = "Hello";
		String str2 = "안녕";

		boolean boolVar = true;
		boolean boolVar2 = 10 > 2;

		// 변수 사용
		intVar = 25;
		intVar = intVar + 2;
		shortVar = 2 + 10;
		byteVar = 2 * 15;
		// byteVar = byteVar * 2;  이유?

		System.out.println(intVar);
		System.out.println(boolVar2);
	}

}
