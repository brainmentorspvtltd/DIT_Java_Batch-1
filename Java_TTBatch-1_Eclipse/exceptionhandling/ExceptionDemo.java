package com.dit.java.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("DB Connection Open");
		System.out.println("DB Query");
//		Try means guarded region
		try {
			
			String path = "E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\File123\\test.txt";
			
			File file = new File(path);
			
			if(file.exists())
			{
				System.out.println("Yes this file is exist");
				file.delete();
			}
			else {
				file.createNewFile();
			}
			
//			String t = null;
//			t.toUpperCase(); // throw new NullPointerException
//			
//			int m[] = new int[10]; 
//			m[11] = 100; // throw new ArrayIndexOutOfBoundsException
//			
//			int e = 100/0; // throw new ArithmeticException
		}
		catch(IOException e)
		{
			System.out.println("File can't be create");
		}
		//handling code
		catch(ArithmeticException e)
		{
			System.out.println("Divide a number by Zero "+e);
			//return;
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You Exceed the Limit");
			return;
		}
		catch(NullPointerException e)
		{
			System.out.println("Value is Null");
			return;
		}
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("DB Connection Close");

	}

}
