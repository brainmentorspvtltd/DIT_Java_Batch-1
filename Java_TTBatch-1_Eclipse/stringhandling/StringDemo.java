package com.dit.java.stringhandling;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Literal Style: 1 or 0
		String name = "Ram";
		String name2 = "Ram";
		
		//String Object Style: 1 or 2
		String name3 = new String("Ram").intern(); // new - dynamic memory
		String name4 = new String("Ram");
		
		System.out.println(name == name2); // true
		System.out.println(name3 == name4); // false
		
		System.out.println(name == name3); // true
		
		String str = "Hello";
		String str1 = str;
		
		System.out.println(str == str1);
		
		str = str + "How are you";
		
		System.out.println(str == str1);

	}

}
