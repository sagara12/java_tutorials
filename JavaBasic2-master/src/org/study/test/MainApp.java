package org.study.test;

import org.study.oopdemo.Course;

public class MainApp {

	public static void main(String[] args) {
		Course course1 = null;
		course1 = Course.getInstance("Eng-101");
		
		Course course2 = Course.getInstance("Ma-202");
		if (course2 != null) {
			course2.setUnit(1);
		}
		course1.setName("Eng-102");
		
		System.out.println("코스1: " + course1.getName()
					+ ", " + course1.getUnit());
		/*
		System.out.println("코스2: " + course2.getName() 
					+ ", " + course2.getUnit());
		*/
	}

}
