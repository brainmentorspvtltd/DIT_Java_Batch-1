package com.dit.java.oops;

//multiple interface

interface Print {
	void printing(); 
}

interface Show {
	void display();
}

class ChildUpdated implements Print, Show {

	@Override
	public void display() {
		System.out.println("Display method of Show Interface");
	}
	@Override
	public void printing() {
		System.out.println("Printing method of Print Interface");
	}
}

public class InterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildUpdated child = new ChildUpdated();
		child.display();
		child.printing();

	}

}
