package com.dit.java.oops;

class PersonUpdated {
	private String name;
	
	public PersonUpdated()
	{
		name = "Ram Kumar";
	}
	
	public void printName()
	{
		System.out.println("Name of the Person is: "+name);
	}
	
	//hidden by using overriding
	public void contNumber()
	{
		System.out.println("Contact Number of Person");
	}
}

class StudUpdated extends PersonUpdated {
	private int id;
	
	public StudUpdated()
	{
		id = 101;
	}
	
	public void printId()
	{
		System.out.println("Id of the Student is: "+id);
	}
	
	@Override
	public void contNumber()
	{
		System.out.println("Contact Number of Student");
	}
}

public class OverridingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudUpdated student = new  StudUpdated();
		student.contNumber();
		student.printId();
		student.printName();
		
	}

}
