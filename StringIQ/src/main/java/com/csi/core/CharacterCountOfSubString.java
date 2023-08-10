package com.csi.core;

public class CharacterCountOfSubString {
	
	public static void main(String[] args) {
		
		//Problem statement - Character count of sub-string
		
		//Method 1 : Direct impl logic
		
		String fullName = "Rohit Galande";
		
		String[] strArr = fullName.split(" ");
		if (strArr.length < 2) {
			System.out.println("Invalid name");
		}
		
		String surName = strArr[strArr.length-1];
		
		
		System.out.println(surName.length());
		//System.out.println(countSurnameChar(fullName));
		
	}

	//Method 2 : create separate method 
	
	/*
	 * private static int countSurnameChar(String fullName) { String[] strings =
	 * fullName.split(" ");
	 * 
	 * if(strings.length < 2) { return 0; }
	 * 
	 * String surName = strings[strings.length-1]; return surName.length(); }
	 */
}
