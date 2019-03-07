package test;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	List<Expression> exList = new ArrayList<> ();

	public int add(int a, int b) {
		//Expression(계산식)을 리스트에 저장
		//1. Expression을 만들어야 함.
		Expression ex = new Expression();
		ex.setFirst(a);
		ex.setSecond(b);
		ex.setOperator('+');
		int result = a + b;
		ex.setResult(result);
		//2. 리스트에 ex을 추가
		exList.add(ex);
		
		return result;
	}

	public int subtract(int a, int b) {
		Expression ex = new Expression();
		ex.setFirst(a);
		ex.setSecond(b);
		ex.setOperator('-');
		int result = a - b;
		ex.setResult(result);
		//2. 리스트에 ex을 추가
		exList.add(ex);
		
		return result;
	}

	public int multiply(int a, int b) {
		Expression ex = new Expression();
		ex.setFirst(a);
		ex.setSecond(b);
		ex.setOperator('*');
		int result = a * b;
		ex.setResult(result);
		//2. 리스트에 ex을 추가
		exList.add(ex);
		
		return result;
	}

	public int divide(int a, int b) {
		Expression ex = new Expression();
		ex.setFirst(a);
		ex.setSecond(b);
		ex.setOperator('/');
		int result = a / b;
		ex.setResult(result);
		//2. 리스트에 ex을 추가
		exList.add(ex);
		
		return result;
	}

	// 모든 기억된 계산식 출력
	public void prev() {
		for (int i = 0; i < exList.size(); i++) {
			System.out.println(i + ": " + exList.get(i));
		}
	}
	
	public Expression prev(int index) {
		return exList.get(index);
	}
}

class Expression {
	private int first;
	private int second;
	private char operator;
	private int result;

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Expression [" + first + operator + second 
					+ " = " + result + "]";
	}

	public int execution() {
		switch (operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
		default:
			break;
		}
		
		return result;
	}
}
