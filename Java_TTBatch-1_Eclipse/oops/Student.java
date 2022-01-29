package com.dit.java.oops;

public class Student {
	
//	class variables/instance variables/ data members
	
//	private data members - data security - data hiding
	
	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	private String collegeName;
	
	//Default Constructor
	Student()
	{
		//Call to the Parameterized Cons
		//this(1001, "Ram Kumar", "8724368327", "BCA", 10000.0);
		collegeName = "DIT";
	}
	
	//Parameterized Constructor
	Student(int rollno, String name, String phone, String course, double fees)
	{
////		instance variables assign local variables
//		
		this(); // Call to the Default Cons
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;		
	}
	
//	r, n, p, c, f - local variables
//	scope is in the function

	//	public void takeInput(int r, String n, String p, String c, double f)
//	public void takeInput(int rollno, String name, String phone, String course, double fees)
//	{
////		instance variables assign local variables
//		
//		this.rollno = rollno;
//		this.name = name;
//		this.phone = phone;
//		this.course = course;
//		this.fees = fees;		
//	}
	
	public void print()
	{
		System.out.println("Roll no is: "+this.rollno);
		System.out.println("Name is: "+name);
		System.out.println("Phone is: "+phone);
		System.out.println("Course is: "+course);
		System.out.println("Fees is: "+fees);
		System.out.println("College Name is: "+collegeName);
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Call to the Parameterized Constructor
		Student ram = new Student(1001, "Ram Kumar", "8724368327", "BCA", 10000.0);
		//Student ram = new Student(); // Call to the Default Constructor 
		// new - to allocate dynamic memory
		//ram.print();
		//ram.takeInput(1001, "Ram Kumar", "8724368327", "BCA", 10000.0);		
		ram.print();
//		ram.setPhone("9459847851");
		System.out.println("****************************************");
//		ram.print();
//		ram - reference variable
		
		Student shyam = new Student(1002, "Shyam Gupta", "874698748854", "MCA", 100000.0);
		shyam.print();
//		System.out.println("Roll no is: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("Phone is: "+ram.phone);
//		System.out.println("Course is: "+ram.course);
//		System.out.println("Fees is: "+ram.fees);
		
//		ram.rollno = 1001;
//		ram.name = "Ram Kumar";
//		ram.phone = "3286496934";
//		ram.course = "BCA";
//		ram.fees = 10000.0;
		
//		System.out.println("****************************************");
		
//		System.out.println("Roll no is: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("Phone is: "+ram.phone);
//		System.out.println("Course is: "+ram.course);
//		System.out.println("Fees is: "+ram.fees);
		
	}

}
