package com.dit.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Data to write in a File");
		String txt = sc.nextLine();
		
		FileOutputStream fo = new FileOutputStream("E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\File\\songs\\sample.txt");
		fo.write(txt.getBytes());
		
		fo.close();
	}
}
