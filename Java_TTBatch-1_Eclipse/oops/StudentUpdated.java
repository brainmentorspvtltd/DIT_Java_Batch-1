package com.dit.java.oops;

public class StudentUpdated {
	
	private int id;
	private String name;
	private double fees;
	private String collegeName;
	
	public StudentUpdated()
	{
		this(101, "Ram Kumar"); // 2nd Cons call
		collegeName = "DIT";
	}
	
	public StudentUpdated(int id, String name) {
		this(10000.0);
		this.id = id;
		this.name = name;
	}

	public StudentUpdated(double fees) {
		this.fees = fees;
	}
	
	public void display()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Fees is: "+fees);
		System.out.println("College Name is: "+collegeName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentUpdated ram = new StudentUpdated(); // Default Cons Call
		ram.display();
		
	}

}
