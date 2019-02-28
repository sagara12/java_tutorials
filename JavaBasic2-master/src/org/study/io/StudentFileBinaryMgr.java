package org.study.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentFileBinaryMgr {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("홍길동바보1234");
		student.setId(123);
		
		//int[] scores = {85, 90, 70};
		/*
		int[] scores = new int[3];
		scores[0] = 85;
		scores[1] = 90;
		scores[2] = 70;
		*/
		student.setScores(new int[] {85, 90, 70});
		
		writeBinaryStudent(student);
		Student temp = readBinaryStudent();
		
		System.out.println(temp);
	}

	private static Student readBinaryStudent() {
		Student student = null;
		try {
			FileInputStream fin = new FileInputStream("student.dat");
			DataInputStream in = new DataInputStream(fin);
			
			// 이름
			String name = in.readUTF();
			// id
			int id = in.readInt();
			// scores
			int[] scores = new int[3];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = in.readInt();
			}
			
			student = new Student();
			student.setName(name);
			student.setId(id);
			student.setScores(scores);
			
			in.close();
			fin.close();
			
			System.out.println("student object was loaded....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}

	private static void writeBinaryStudent(Student student) {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("student.dat");
			DataOutputStream out = new DataOutputStream(fout);
			
			// 이름
			out.writeUTF(student.getName());
			// 아이디
			out.writeInt(student.getId());
			// 점수
			for (int score : student.getScores()) {
				out.writeInt(score);
			}
			
			out.close();
			fout.close();
			
			System.out.println("student.dat file written...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
