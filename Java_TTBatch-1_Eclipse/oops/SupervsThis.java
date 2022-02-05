package com.dit.java.oops;
class A {
	private int x;
	
	A()
	{
		System.out.println("A Default Cons Call");
	}
	A(int x)
	{
		this();
		this.x = x;
		System.out.println("A Param Cons Call " +x);
	}
}
class B extends A {
	private int y;
	
	B()
	{
		super(99);
		System.out.println("B Default Cons Call");
	}	
	B(int y)
	{
		this();
		//super(99);
		this.y = y;
		System.out.println("B Param Cons Call " +y);
	}
}

public class SupervsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(100);
	}

}
