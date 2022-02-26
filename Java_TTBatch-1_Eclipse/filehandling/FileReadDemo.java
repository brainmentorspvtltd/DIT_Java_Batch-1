package com.dit.java.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\Java\\src\\com\\dit\\java\\filehandling\\FileReadDemo.java";
		
		File file = new File(path);
		
		final int EOF = -1;
		
		if(file.exists())
		{
			FileInputStream fs = new FileInputStream(file);
			int singleByte = fs.read(); // 1 byte
			
			while(singleByte != EOF) // -1 to EOF
			{
				System.out.print((char)singleByte);
				singleByte = fs.read();
			}
			
			fs.close();
		}
		
	}

}
