package com.dit.java.stringhandling;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Amiit";
		
		System.out.println(name.length()); // 4
		System.out.println(name.charAt(2)); // i
		System.out.println(name.substring(1, 3));// mi
		
//		1 - index number (start from 0)
//		3 - position number (start from 1)
		
		//System.out.println(name.trim());
		System.out.println(name.replace('t', 'n'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(" Kumar"));
		System.out.println(name + " Delhi");
		System.out.println(name.indexOf('i'));
		System.out.println(name.lastIndexOf('i'));
		

	}
}
