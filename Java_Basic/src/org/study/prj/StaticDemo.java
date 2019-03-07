package org.study.prj;

public class StaticDemo {

	public static void main(String[] args) {
		Book myBook = new Book();
		Book yourBook = new Book();
		
		myBook.title = "헤리포터";
		myBook.pages = 550;
		//Book.location = "England";
		
		System.out.println(myBook.info());
		
		yourBook.title = "홍길동";
		//yourBook.pages = 200;
		
		System.out.println(yourBook.info());
	}

}

class Book {
	private static String location = "Korea";
	
	String title;
	int pages;
	
	public String info() {
		String result = "Book [" + title + "(" + pages + ") - " 
					+ location + "]";
		return result;
	}
	
	public static void setLocation(String newLocation) {
		location = newLocation;
		
		//title = title + ", " + location;
	}
	
	
}