package org.study.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentFileBinaryMgr2 {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<> ();
		
		Student student = new Student();
		student.setName("홍길동");
		student.setId(123);
		student.setScores(new int[] {85, 90, 70});
		
		studentList.add(student);
		
		Student student2 = new Student();
		student2.setName("박철순");
		student2.setId(876);
		student2.setScores(new int[] {65, 100, 90});
		
		studentList.add(student2);
		
		Student student3 = new Student();
		student3.setName("임지택");
		student3.setId(982);
		student3.setScores(new int[] {55, 70, 30});
		
		studentList.add(student3);
		
		writeBinaryStudents(studentList);
		List<Student> temp = readBinaryStudents();
		
		System.out.println(temp);
	}

	private static List<Student> readBinaryStudents() {
		List<Student> students = new ArrayList<> ();
		try {
			FileInputStream fin = new FileInputStream("student.dat");
			DataInputStream in = new DataInputStream(fin);
			
			while (true) {
				if (in.available() == 0) {
					break;
				}
				
				// 이름
				String name = in.readUTF();
				// id
				int id = in.readInt();
				// scores
				int[] scores = new int[3];
				for (int i = 0; i < scores.length; i++) {
					scores[i] = in.readInt();
				}
				
				Student student = new Student();
				student.setName(name);
				student.setId(id);
				student.setScores(scores);
				
				students.add(student);
				
			}

			in.close();
			fin.close();
			
			System.out.println("student object was loaded....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return students;
	}

	private static void writeBinaryStudents(List<Student> list) {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("student.dat");
			DataOutputStream out = new DataOutputStream(fout);

			for (Student student : list) {
				// 이름
				out.writeUTF(student.getName());
				// 아이디
				out.writeInt(student.getId());
				// 점수
				for (int score : student.getScores()) {
					out.writeInt(score);
				}
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
