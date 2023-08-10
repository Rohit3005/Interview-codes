package com.csi.core;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "MADAMa";
		
		System.out.println(isPalindrome(str));

	}

	public static boolean isPalindrome(String str) {
		// Remove all non-alphanumeric characters and convert to lower case
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		// Check if the string is the same forwards and backwards
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
