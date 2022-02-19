package com.dit.java.stringhandling;

public class RemoveDuplicates {
	
	public static String removeDuplicates(String s)
	{
		String str = new String();
		int len = s.length();
		
		for(int i = 0; i < len; i++)
		{
			char c = s.charAt(i);
			
			if(str.indexOf(c) < 0) // -1
			{
				str += c;
			}
		}
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String s = "Javaa";
		System.out.println(removeDuplicates(s));

	}

}
