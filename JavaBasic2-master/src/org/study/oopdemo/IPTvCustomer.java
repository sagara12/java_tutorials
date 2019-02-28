package org.study.oopdemo;

public class IPTvCustomer extends Customer {

	String servType;
	int speed;
	int contractYear;
	double monthlyPayment;
	
	public IPTvCustomer(String name, int birthYear) {
		super(name, birthYear);
	}

	public String getServType() {
		return servType;
	}

	public void setServType(String servType) {
		this.servType = servType;
		
		monthlyPayment = 15000;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getContractYear() {
		return contractYear;
	}

	public void setContractYear(int contractYear) {
		this.contractYear = contractYear;
	}

	
	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	
}
