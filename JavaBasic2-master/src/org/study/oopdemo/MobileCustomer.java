package org.study.oopdemo;

public class MobileCustomer extends Customer {
	
	String mobileNum;
	String mobileServType;
	double monthlyPayment;
	
	public MobileCustomer(String name, int birthYear) {
		super(name, birthYear); // --> Customer();
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getMobileServType() {
		return mobileServType;
	}

	public void setMobileServType(String mobileServType) {
		this.mobileServType = mobileServType;
		
		monthlyPayment = 10000;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	
}
