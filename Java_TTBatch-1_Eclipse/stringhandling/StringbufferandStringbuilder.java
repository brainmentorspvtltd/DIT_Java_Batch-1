package com.dit.java.stringhandling;

public class StringbufferandStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.capacity()+" "+sb.length());
		sb.append("Hello");
		System.out.println(sb.capacity()+" "+sb.length());
		sb.append("How are you I am fine ygkweeiuerltuigleitugroeiultgieurgtiuert");
		System.out.println(sb.capacity()+" "+sb.length());
		sb.append("How are");
		System.out.println(sb.capacity()+" "+sb.length());

	}

}
