package com.dit.java.oops;

interface Addition {
	int add(int a, int b);
}


public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lambda Expression
		Addition add1 = (a, b)->(a + b);
		System.out.println(add1.add(100, 200));
		
		Addition add2 = (int a, int b)->(a + b);
		System.out.println(add2.add(34, 56));
		
	}

}
