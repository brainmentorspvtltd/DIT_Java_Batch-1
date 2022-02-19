package com.dit.java.exceptionhandling;

public class ExceptionConcept {
	
	static void DB() throws ArithmeticException
	{
		System.out.println("Connection Open");
		try {
			int e = 100 / 0;
			System.out.println("Query and Get result");
			System.out.println("Send result to Helper");
		}
		finally { // finally is a block which always execute.
			System.out.println("Connection Close");
		}
	}
	
	static void helper() throws ArithmeticException
	{
		System.out.println("Call DB");
		DB();
		System.out.println("Get result from DB");
		System.out.println("Send result to View");
	}
	
	static void view()
	{
		System.out.println("Call Helper");
		try {
			helper();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide a number by zero");
			System.exit(0);
		}
		System.out.println("Get result from helper");
		System.out.println("Print result to User");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		view();

	}

}
