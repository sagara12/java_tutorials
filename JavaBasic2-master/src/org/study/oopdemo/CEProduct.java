package org.study.oopdemo;

public class CEProduct extends Product {

	private static int numOfInstances = 0;
	
	private String productLocale;
	
	public CEProduct(String pName) {
		super(pName);
		numOfInstances++;
		
		setSymbol("\u221E");
		serialCode = "CE-" + String.format("%05d", numOfInstances);
	}

	public String getProductLocale() {
		return productLocale;
	}

	public void setProductLocale(String productLocale) {
		this.productLocale = productLocale;
	}
	
}
