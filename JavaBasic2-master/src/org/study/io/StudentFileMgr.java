package org.study.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFileMgr {

	public static void main(String[] args) {

		Student student = new Student();
		student.setName("홍길동");
		student.setId(123);
		
		//int[] scores = {85, 90, 70};
		/*
		int[] scores = new int[3];
		scores[0] = 85;
		scores[1] = 90;
		scores[2] = 70;
		*/
		student.setScores(new int[] {85, 90, 70});
		
		writeStudent(student);
		Student temp = readStudent();
		
		System.out.println(temp);
	}

	private static Student readStudent() {
		Student student = null;
		try {
			FileReader reader = new FileReader("student.txt");
			// 이름
			char[] buf = new char[3];
			reader.read(buf);
			// 아이디
			int id = reader.read();
			// 점수
			int[] scores = new int[3];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = reader.read();
			}

			reader.close();
			
			student = new Student();
			String name = new String(buf);
			student.setName(name);
			student.setId(id);
			student.setScores(scores);
			
			System.out.println("student object was set");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}

	private static void writeStudent(Student student) {
		// student 정보를 파일에 저장
		// 포맷: 텍스트 / 바이너리
		try {
			FileWriter fwriter = new FileWriter("student.txt");
			//이름
			fwriter.write(student.getName());
			//아이디
			fwriter.write(student.getId());
			//점수(정수 배열)
			for (int i = 0; i < student.getScores().length; i++) {
				fwriter.write(student.getScores()[i]);
			}
			
			fwriter.close();
			
			System.out.println("student.txt file write done...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
