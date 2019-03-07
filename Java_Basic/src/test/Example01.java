package test;

public class Example01 {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		System.out.println(myCalc.add(100, 10));
		System.out.println(myCalc.subtract(5, 10));
		System.out.println(myCalc.divide(100, 5));
		
		myCalc.prev();
		Expression ex = myCalc.prev(1);
		ex.setSecond(100);
		System.out.println(ex.execution());
	}
}








