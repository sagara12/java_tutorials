package org.study.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileTest test = new FileTest();
		
		try {
			test.appendStringToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void writeStringToFile() throws IOException {
		String fileName= "resources/test.txt";
		String content = "안녕하세요";
		BufferedWriter writer = 
				new BufferedWriter(new FileWriter(fileName));
		writer.write(content);
		
		writer.close();
	}
	
	public void appendStringToFile() throws IOException {
		String fileName= "resources/test.txt";
		String content = "\n반갑습니다";
		BufferedWriter writer = 
				new BufferedWriter(new FileWriter(fileName, true));
		writer.write(content);
		
		writer.close();
	}
}
