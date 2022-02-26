package com.dit.java.filehandling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dirPath, String fileName) {
		
//		return fileName.endsWith(".mp3");
		return fileName.endsWith(".txt");
	}

}

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\File\\sample.txt";
		
		File file = new File(path);
		
		if(file.exists())
		{
			File file2 = new File("E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\File\\samplecopy.txt");
			file.renameTo(file2);
//			file.delete();
//			System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());

//		path = "E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\File\\songs\\aa\\bb\\cc";
//		
//		file = new File(path);
//		
////		file.mkdir();
//		file.mkdirs();
		
		file = new File("E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\File\\songs");
		
//		MyFilter filter = new MyFilter();	
//		File files[] = file.listFiles(filter);
		
		File files[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".mp3"));
		System.out.println("No of Files Mp3: "+files.length);
		File files2[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".txt"));
		System.out.println("No of Files txt: "+files2.length);
	}

}
