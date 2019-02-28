package org.study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("demo.txt");
			//fos.write(100);
			//fos.write(125);
			
			String message = "안녕하세요";
			byte[] byteMessage = message.getBytes();
			
			fos.write(byteMessage);
			
			fos.close();
			
			System.out.println("file write success...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
