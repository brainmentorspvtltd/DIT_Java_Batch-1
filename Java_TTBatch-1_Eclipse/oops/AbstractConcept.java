package com.dit.java.oops;

abstract class Person__ {
	
	private String name;
	private int age;
	
	public Person__(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void print()
	{
		System.out.println(name+" "+age);
	}
	
	public abstract void contNumber(); // only declared, not defined	
}

class Student__ extends Person__ {
	
	private int id;
	
	public Student__(int id)
	{
		super("Ram Kumar", 25);
		this.id = id;
	}
	
	public void printId()
	{
		System.out.println(id);
	}

	@Override
	public void contNumber() {
		
		System.out.println("Student's Contact Number");	
	}
}

public class AbstractConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student__ student = new Student__(100);
		student.print();
		student.printId();
		student.contNumber();
		
		//Person__ person = new Person__(); // error
	}

}
