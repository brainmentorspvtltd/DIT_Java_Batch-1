package com.dit.java.stringhandling;

public class StringBuffervsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("Java");
		for(int i = 0; i < 10000; i++)
		{
			sb.append("Example");
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken by StringBuffer is: "+(endTime - startTime));
		
		startTime = System.currentTimeMillis();
		
		StringBuilder sb2 = new StringBuilder("Java");
		for(int i = 0; i < 10000; i++)
		{
			sb2.append("Example");
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("Time taken by StringBuilder is: "+(endTime - startTime));

	}

}
