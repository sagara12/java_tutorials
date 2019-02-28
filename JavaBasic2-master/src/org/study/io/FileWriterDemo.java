package org.study.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			Writer wr = new FileWriter("output.txt");
			
			wr.write("Hello World!" + System.lineSeparator());
			wr.write("안녕하세요");
			
			wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done...");
	}

}
