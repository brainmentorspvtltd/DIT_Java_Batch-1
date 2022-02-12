package com.dit.java.oops;

class Parent {
	void show()
	{
		System.out.println("Parent Class");
	}
}

class Child extends Parent {
	@Override
	void show()
	{
		System.out.println("Child Class");
	}
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Upcasting: child to parent object
		Parent parent = new Child();
		parent.show();
		
		//Downcasting: parent to child object
//		Child child = new Parent(); // Compile time error
		
		Child child = (Child)parent;
		child.show();
	}

}
