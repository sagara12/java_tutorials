package org.study.oopdemo;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

	// 그룹 고객관리 프로그램
	public static void main(String[] args) {
		MobileCustomer customer = new MobileCustomer("Lim", 1970);
		
		customer.setGender('m');
		customer.setEmail("jitaek@naver.com");
		customer.setMobileServType("LTE40");
		
		IPTvCustomer customer2 = new IPTvCustomer("홍길동", 970);
		customer2.setGender('m');
		customer2.setEmail("hong@naver.com");
		customer2.setServType("Gbit");
		
		//Customer customer3 = new Customer();
		//System.out.println(customer2);
		
		// 고객의 한달 사용료가 얼마인지?
		double payment = calcCustomerMonthlyPayment(customer);
		//System.out.println("Customer: " + payment);
		
		// Collection
		// List
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);
		customers.add(customer2);
		
		Customer temp = customers.remove(1);
		System.out.println(temp);
		System.out.println(customers.size());
		
		for (int i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i));
		}
	}

	// 다형성
	private static double calcCustomerMonthlyPayment(Customer customer) {
		return customer.getMonthlyPayment();
	}

}
