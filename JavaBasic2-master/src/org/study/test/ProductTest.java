package org.study.test;

import org.study.oopdemo.CEProduct;
import org.study.oopdemo.ITProduct;
import org.study.oopdemo.Product;
import org.study.oopdemo.ProductType;

public class ProductTest {

	// 세가지 종류의 상품 객체 생성
	// 속성값을 변경
	// 출력
	public static void main(String[] args) {
		//Product a = new Product();
		
		Product product01 = new ITProduct("TV-NX1012");
		
		product01.setProductPrice(2500.0);
		product01.setNumOfStock(50);	
	
		Product product02 = new ITProduct("Setop-p10");
		
		Product product03 = new CEProduct("REF-CX100");
		
		System.out.println(product01);
		System.out.println(product02);
		System.out.println(product03);
	}

}
