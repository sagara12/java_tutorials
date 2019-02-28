package org.study.oopdemo;

public class Course {
	// 속성
	// 코스이름, 강사의 이름, 코스의 학점,
	String name;
	String lecturerName;
	int unit;

	// 동작(method)
	// 생성자
	private Course(String name) {
		this.name = name;
		unit = 4;
	}

	private Course(String name, String lecturerName, int unit) {
		this.name = name;
		this.lecturerName = lecturerName;
		this.unit = unit;
	}

	// Factory pattern
	public static Course getInstance(String name) {
		// 정규표현식
		if (name.matches("[\\w]{3}-[\\d]{3}")) {
			Course newCourse = new Course(name);
			return newCourse;
		} else {
			System.out.println("코스이름 규정에 맞지 않습니다.");
		}

		return null;
	}

	// 코스의 이름을 변경
	// XXX-DDD --> XXX 영어 레터 DDD 숫자
	// [/w]3-[/d]3
	public void setName(String name) {
		int length = name.length();

		if (length != 7) {
			System.out.println("코스 이름의 길이가 맞지 않습니다.");
			return;
		}

		/*
		 * for (int i = 0; i < length; i++) { if (i < 3) { if (!((name.charAt(i) >= 65
		 * && name.charAt(i) <= 90) || (name.charAt(i) >= 97 && name.charAt(i) <= 122)))
		 * { System.out.println("코스 이름의 앞부분이 맞지 않습니다."); return; } } else if (i == 3) {
		 * if (name.charAt(i) != '-') { System.out.println("코스 이름 중간이 맞지 않습니다.");
		 * return; } } else { if (!(name.charAt(i) >= 48 && name.charAt(i) <= 57)) {
		 * System.out.println("코스 이름의 뒷부분이 맞지 않습니다."); return; } } }
		 */

		/*
		 * for (int i = 0; i < length; i++) { if (i < 3) { if
		 * (Character.isLetter(name.charAt(i)) != true) {
		 * 
		 * } } }
		 */

		// 정규표현식
		if (name.matches("[\\w]{3}-[\\d]{3}")) {
			this.name = name;
		} else {
			System.out.println("코스이름 규정에 맞지 않습니다.");
		}

	}

	// 코스의 이름을 얻어가는 방법
	public String getName() {
		return name;
	}

	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		// 학점은 최소 2 이상이고, 5이하이다.
		if (unit >= 2 && unit <= 5) {
			this.unit = unit;
		} else {
			System.out.println("잘못된 학점입니다.");
		}

	}

}
