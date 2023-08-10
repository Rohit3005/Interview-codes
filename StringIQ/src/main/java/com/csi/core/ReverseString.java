package com.csi.core;

public class ReverseString {

	public static void main(String[] args) {

		String string = "ROHIT";

		// Using inbuilt function
		StringBuffer buffer = new StringBuffer(string);
		System.out.println(buffer.reverse());

		// without inbuilt function
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}

}
