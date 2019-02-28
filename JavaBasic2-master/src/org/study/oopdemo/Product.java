package org.study.oopdemo;

// 상품 클라스
// 속성:
//	상품이름
//  상품종류: IT(1) / 가전(2) / Mobile(3)
//  상품코드(serialCode):
//     - IT-00001 
//     - CE-01234
//     - Mb-12345
//  가격
//  Stock:
// 동작:
//  생성자
//    - default
//    - 상품이름
//    - 상품이름 / 가격 / stock
//  getters / setters 메소드

public abstract class Product {

	private String productName;
	private String symbol;
	protected String serialCode;

	private double productPrice;
	private int numOfStock;
	
	// 생성자
	public Product() {
	}

	public Product(String productName) {
		this.productName = productName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSerialCode() {
		return serialCode;
	}

	public void setSerialCode(String serialCode) {
		this.serialCode = serialCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getNumOfStock() {
		return numOfStock;
	}

	public void setNumOfStock(int numOfStock) {
		this.numOfStock = numOfStock;
	}
	
	@Override
	public String toString() {
		return "Product [productName=" + symbol 
				+ productName + ", serialCode=" + serialCode + ", productPrice=" + productPrice
				+ ", numOfStock=" + numOfStock + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((serialCode == null) ? 0 : serialCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (serialCode == null) {
			if (other.serialCode != null)
				return false;
		} else if (!serialCode.equals(other.serialCode))
			return false;
		return true;
	}
}







