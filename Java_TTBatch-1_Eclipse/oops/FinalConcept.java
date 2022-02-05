package com.dit.java.oops;

final class Base {
	public final void show()
	{
		System.out.println("This is Base Class");
	}
}

class Derived extends Base {
	@Override
	public void show()
	{
		System.out.println("This is Derived Class");
	}
}

public class FinalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final float PI = 3.14f;
		
		//PI = 34.6f; // 
		
	}

}
