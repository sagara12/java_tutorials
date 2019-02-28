package org.study.oopdemo;

public class ITProduct extends Product {

	private static int numOfInstances = 0;
	
	
	private boolean isWireless;
	
	public ITProduct(String pName) {
		super(pName);
		setSymbol("\u000E");
		numOfInstances++;
		
		serialCode = "IT-" + String.format("%05d", numOfInstances);
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	
	
}
