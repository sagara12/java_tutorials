package org.study.oopdemo;

public abstract class Customer {

	private String name;
	// M F
	private char gender;
	private String email;
	private int birthYear;
	
	// default constructor
	
	// constrcutors
	public Customer(String name, int birthYear) {
		this.name = name;
		
		if (birthYear >= 1900 && birthYear <= 2019) {
			this.birthYear = birthYear;
		}
		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	// Getters / Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(char gender) {
		if (gender == 'M' || gender == 'm') {
			this.gender = 'M';
		} else if (gender == 'F' || gender == 'f') {
			this.gender = 'F';
		} else {
			System.out.println("잘못된 값입니다");
		}
	}

	public abstract double getMonthlyPayment() ;
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}
	
}




 






