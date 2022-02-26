package com.dit.java.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String sourcePath = "E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\File\\songs\\A.mp3";
		String desPath = "E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\File\\songs\\ACopy.mp3";
		
		File file = new File(sourcePath);
		
		if(!file.exists())
		{
			System.out.println("Can't copy the file");
			return;
		}
		
		final int EOF = -1;
		
		FileInputStream fs = new FileInputStream(file);
		BufferedInputStream bs = new BufferedInputStream(fs);
		
		FileOutputStream fo = new FileOutputStream(desPath);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("Start Copying");
		
		int singleByte = bs.read();
		
		while(singleByte != EOF)
		{
			bo.write(singleByte);
			singleByte = bs.read();
		}
		
		bo.close();
		bs.close();
		fo.close();
		fs.close();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Data Copied "+(endTime - startTime)+"ms");
	}

}
