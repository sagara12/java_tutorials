package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("demo.txt");
			
			int i = 0;
			
			while (i != -1) {
				i = fin.read();
				System.out.println((char)i);
			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			System.err.println("해당 파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Done...");
	}

}
