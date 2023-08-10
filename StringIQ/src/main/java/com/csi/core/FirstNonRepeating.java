package com.csi.core;

public class FirstNonRepeating {

	public static void main(String[] args) {

		String string = "aabbccddfeg";

		for (char i : string.toCharArray()) {
			if (string.indexOf(i) == string.lastIndexOf(i)) {
				System.out.println(i);
				break;
			}
		}

	}

}
