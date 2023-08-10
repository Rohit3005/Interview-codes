package com.csi.core;

public class WordCount {
	
	public static void main(String[] args) {
		
		String str = "Java is programming language";
		
		String[] strArr = str.split(" ");
		
		System.out.println( "Word Count = "+strArr.length);
	}

}
