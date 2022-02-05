package com.dit.java.oops;

class People_
{
	private int id;
	private String name;
	
	public People_()
	{
		//this("Rahul");
		id = 100;
	}	
	public People_(String name)
	{
		this();
		this.name = name;
	}	
	public void display()
	{
		System.out.println(id+" "+name);
	}
}

class Employee extends People_ {
	
	private String domain;
	private String phone;
	
	public Employee()
	{
		super("Rahul");
		//this("873598958");
		domain = "IT";
	}	
	public Employee(String phone)
	{
		this();
		this.phone = phone;
	}	
	public void show()
	{
		System.out.println(domain+" "+phone);
	}
}

public class ISAConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee("8634826196");
		e.display(); e.show();

	}

}
