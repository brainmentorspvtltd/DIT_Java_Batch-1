package com.dit.java.oops;

public class FinalizeMethod  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeMethod obj = new FinalizeMethod();
		
		obj = null; // unused object
		
		// request to JVM to call garbage collector
		System.gc();
		System.out.println("Main Complete");
	
	}
	
	//overriding finalize method
	public void finalize()
	{
		System.out.println("Finalize Method Called");
	}

}
