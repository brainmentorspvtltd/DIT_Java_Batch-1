package com.dit.java.oops;

class Person_ { // Parent Class or Base Class
	private String name;
	public Person_(String name)
	{
		this.name = name;
	}
//	public Person_()
//	{
//		name = "Ram Kumar";
//	}
	
	public void printName()
	{
		System.out.println("Name of the Person is: "+name);
	}
}
//Child Class or Sub Class or Derived Class
class Student_ extends Person_ // Inheritance or Class Relationship
{
	private int id;
	
	public Student_()
	{
		super("Ram Kumar"); // Explicit Parent Param Cons Call 
		//super(); // Parent Default Cons Call (Implicit Super Call)
		id = 1001;
	}
	
	public void printId()
	{
		System.out.println("Student id is: "+id);
	}
}
public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_ student = new Student_();
		student.printId();
		student.printName();

	}

}
