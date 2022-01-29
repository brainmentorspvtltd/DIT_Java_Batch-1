package com.dit.java.oops;

class Person {
	private int age;
	private char gender;

	//Parameterized Cons
//	Person(int age, char gender)
//	{
//		this.age = age;
//		this.gender = gender;
//	}
	
	public Person(int age, char gender) {
		this.age = age;
		this.gender = gender;
	}

	public void print()
	{
		System.out.println("Age is: "+age+" "+" Gender is: "+gender);
	}
}

public class Stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person rahul = new Person(25, 'M');
		rahul.print();
//		rahul.age = 25;
//		rahul.gender = 'M';
		
//		System.out.println("Age is: "+rahul.age+" "+" Gender is: "+rahul.gender);

	}

}
