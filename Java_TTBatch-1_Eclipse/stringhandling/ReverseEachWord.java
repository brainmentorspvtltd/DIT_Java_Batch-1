package com.dit.java.stringhandling;

public class ReverseEachWord {
	
	public static void reverseWord(String input)
	{
		String words[] = input.split(" ");
		
		String revString = "";
		
		for(int i = 0; i < words.length; i++)
		{
			String word = words[i]; // Java
			
			String revWord = "";
			
			for(int j = word.length()-1; j >= 0; j--)
			{
				revWord += word.charAt(j);
			}
			
			revString = revString + revWord+" ";
		}
		
		System.out.println(revString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseWord("Java Example");

	}

}
