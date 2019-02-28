package org.study.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {

	public static void main(String[] args) {
		try {
			Reader rd = new FileReader("output.txt");
			
			int ch = 0;
			
			while (ch != -1) {
				ch = rd.read();
				System.out.print((char) ch);
			}
			
			rd.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Done...");
	}

}
